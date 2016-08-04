package com.javarush.test.level39.lesson09.big01;

import com.javarush.test.level39.lesson09.big01.query.IPQuery;

import java.io.*;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class LogParser implements IPQuery {
    private Path logDir;
    private ArrayList<Entry> logs = new ArrayList<>();
    private ArrayList<File> filesArray = new ArrayList<>();

    public LogParser(Path logDir) {
        this.logDir = logDir;
        this.logs = getLogs();
    }

    private ArrayList<Entry> getLogs() {
        parseFiles(logDir.toString());
        for (File file : filesArray) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while (reader.ready()) {
                    logs.add(new Entry(reader.readLine()));
                }
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        }
        return logs;
    }

    private void parseFiles(String path) {
        File dir = new File(path);
        File[] listFiles = dir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    parseFiles(file.getAbsolutePath());
                } else {
                    if (file.getAbsoluteFile().toString().endsWith(".log")) {
                        filesArray.add(file.getAbsoluteFile());
                    }
                }
            }
        }
    }

    @Override
    public int getNumberOfUniqueIPs(Date after, Date before) {
        Set<String> uniqueSet = new HashSet();
        for (Entry entry : periodList(after, before)){
            uniqueSet.add(entry.getIp());
        }
        return uniqueSet.size();
    }

    private ArrayList<Entry> periodList(Date after, Date before) {
        ArrayList<Entry> result = new ArrayList<>();
        if (after == null && before == null) {
            result.addAll(logs);
        } else if (after == null) {
            for (Entry entry : logs) {
                if (entry.getDate().compareTo(before) <= 0) {
                    result.add(entry);
                }
            }
        } else if (before == null) {
            for (Entry entry : logs) {
                if (entry.getDate().compareTo(after) >= 0) {
                    result.add(entry);
                }
            }
        } else {
            for (Entry entry : logs) {
                if ((entry.getDate().compareTo(after) >= 0) && (entry.getDate().compareTo(before) <= 0)) {
                    result.add(entry);
                }
            }
        }
        return result;
    }

    @Override
    public Set<String> getUniqueIPs(Date after, Date before) {
        Set<String> uniqueSet = new HashSet();
        for (Entry entry : logs){
            uniqueSet.add(entry.getIp());
        }
        return uniqueSet;
    }

    @Override
    public Set<String> getIPsForUser(String user, Date after, Date before) {
        Set<String> uniqueSet = new HashSet();
        for (Entry entry : logs){
            if (entry.getName().equals(user)) {
                uniqueSet.add(entry.getIp());
            }
        }
        return uniqueSet;
    }

    @Override
    public Set<String> getIPsForEvent(Event event, Date after, Date before) {
        Set<String> uniqueSet = new HashSet();
        for (Entry entry : logs){
            if (entry.getEvent().equals(event)) {
                uniqueSet.add(entry.getIp());
            }
        }
        return uniqueSet;
    }

    @Override
    public Set<String> getIPsForStatus(Status status, Date after, Date before) {
        Set<String> uniqueSet = new HashSet();
        for (Entry entry : logs){
            if (entry.getStatus().equals(status)) {
                uniqueSet.add(entry.getIp());
            }
        }
        return uniqueSet;
    }
}
