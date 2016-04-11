package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id,
найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       // if (args[0].equals("-c")) addString(args);
        String[] a = {"-c", "авыа ываыва ываыва ываыаыв аываыва ыва ыв а", "10173.99", "123 "};
        addString(a);
        String[] b = {"-c", "coatasdadasdasdasdasdasdasdasdasdasdasdasd", "1.99", "9999"};
        addString(b);
        String[] c = {"-c", "coaaasdasdt", "0", "0"};
        addString(c);
    }

    private static void addString(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        String str;
        int max = 0;
        while ((str = bufferedReader.readLine()) != null && str.length() != 0) {
            int id = Integer.parseInt(str.substring(0, 7).trim());
            if (max == 0 || id > max) max = id;
        }
        bufferedReader.close();
        String id = String.format("%-8s", String.valueOf(max + 1));
        String productName = String.format("%-30s", args[1]);
        if (productName.length() > 30) productName = productName.substring(0, 29);
        String price = String.format("%-8s", args[2]);
        String quantity = String.format("%-4s", args[3]);
        String resStr = id + productName + price + quantity;

        FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true)));
        bufferedWriter.write("\n" + resStr);
        bufferedWriter.close();
    }
}