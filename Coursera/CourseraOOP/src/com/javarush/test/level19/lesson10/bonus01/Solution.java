package com.javarush.test.level19.lesson10.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        String file1 = file.readLine();
        String file2 = file.readLine();
        file.close();
        BufferedReader bufferedReader1 =  new BufferedReader(new FileReader(file1));
        BufferedReader bufferedReader2 =  new BufferedReader(new FileReader(file2));
        String line1 = bufferedReader1.readLine();
        String line2 = bufferedReader2.readLine();
        while (line1 != null && line2 != null) {
            if (line1.equals(line2))
            {
                LineItem item = new LineItem(Type.SAME, line1);
                lines.add(item);
            }else if (line2 == "")
            {
                LineItem item = new LineItem(Type.REMOVED, line1);
                lines.add(item);
            }else if (line1 == "")
            {
                LineItem item = new LineItem(Type.ADDED, line2);
                lines.add(item);
            }
            line1 = bufferedReader1.readLine();
            line2 = bufferedReader2.readLine();
        }
        if (line1 == null && line2 != null)
            diffs.add("File \"" + name2 + "\" has extra lines at line " +
                    reader2.getLineNumber() + ":\n" + line2);
        if (line1 != null && line2 == null)
            diffs.add("File \"" + name1 + "\" has extra lines at line " +
                    reader1.getLineNumber() + ":\n" + line1);
    }




    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
