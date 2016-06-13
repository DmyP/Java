package com.javarush.test.level30.lesson15.big01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();


    public static void main(String[] args) throws IOException{
        int serverPort = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(serverPort)) {
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void sendBroadcastMessage(Message message){
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Message don't send");
            }
        }
    }

    private static class Handler extends Thread{
        private Socket socket;

        private void sendListOfUsers(Connection connection, String userName) throws IOException{
            for (String key : connectionMap.keySet()){
                Message message = new Message(MessageType.USER_ADDED, key);
                if (!key.equals(userName)){
                    connection.send(message);
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    String s = userName + ": " + message.getData();
                    sendBroadcastMessage(new Message(MessageType.TEXT, s));
                } else {
                    ConsoleHelper.writeMessage("Error");
                }
            }

        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{
            while (true){
                // Сформировать и отправить команду запроса имени пользователя
                connection.send(new Message(MessageType.NAME_REQUEST));
                // Получить ответ клиента
                Message message = connection.receive();
                // Проверить, что получена команда с именем пользователя
                if (message.getType() == MessageType.USER_NAME){
                    //	Достать из ответа имя, проверить, что оно не пустое
                    if (message.getData() != null && !message.getData().isEmpty()) {
                        //и пользователь с таким именем еще не подключен (используй connectionMap)
                        if (connectionMap.get(message.getData()) == null) {
                            // Добавить нового пользователя и соединение с ним в connectionMap
                            connectionMap.put(message.getData(), connection);
                            // Отправить клиенту команду информирующую, что его имя принято
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            //Вернуть принятое имя в качестве возвращаемого значения
                            return message.getData();
                        }
                    }
                }
            }
        }

        public Handler (Socket socket){
            this.socket = socket;
        }
    }
}
