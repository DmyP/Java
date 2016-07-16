package com.javarush.test.level39.lesson09.big01;

import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
       /* LogParser logParser = new LogParser(Paths.get("c:/logs/"));
        System.out.println(logParser.getNumberOfUniqueIPs(null, new Date()));*/


        LogParser logParser = new LogParser(Paths.get("./"));

        // проверка на дату 30.08.2012 16:08:13 (первый вывод в консоль должен быть 1)
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy H:mm:ss", Locale.ENGLISH);
        Date date = null;
        date = format.parse("30.08.2012 16:08:13");
        System.out.println("getNumberOfUniqueIPs - " + logParser.getNumberOfUniqueIPs(date, date));
        System.out.println("getUniqueIPs - " + logParser.getUniqueIPs(null, null));
        System.out.println("getIPsForUser - " + logParser.getIPsForUser("Vasya Pupkin", null, null));
        System.out.println("getIPsForEvent - " + logParser.getIPsForEvent(Event.DONE_TASK, null, null));
        System.out.println("getIPsForStatus - " + logParser.getIPsForStatus(Status.OK, null, null));
    }
}
