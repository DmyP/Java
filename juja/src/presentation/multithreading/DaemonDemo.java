package presentation.multithreading;

public class DaemonDemo {
    public static void main(String[] args) {
        Thread th = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                    }
                    break;
                }
            }
        };
        th.setDaemon(true);
        th.start();
        System.out.println("Finished method main");
    }
}
