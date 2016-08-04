package com.javarush.test.level39.lesson09.big01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry {
    private String ip;
    private String name;
    private Date date;
    private Event event;
    private int taskNum;
    private Status status;

    public Entry() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy' 'HH:mm:ss");
        ip = "";
        name = "";
        date = new Date();
        event = null;
        taskNum = 0;
        status = null;
    }

    public Entry(String strLog) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy' 'HH:mm:ss");
        String[] arrayLog = strLog.split("\\t");

        if (arrayLog.length == 5) {
            ip = arrayLog[0];
            name = arrayLog[1];
            date = simpleDateFormat.parse(arrayLog[2]);
            String eventString = arrayLog[3];
            if (eventString.contains(" ")) {
                event = Event.valueOf(eventString.substring(0, eventString.indexOf(" ")));
                taskNum = Integer.parseInt(eventString.substring(eventString.indexOf(" ") + 1));
            } else {
                event = Event.valueOf(eventString);
            }
            status = Status.valueOf(arrayLog[4]);
        }
    }

    @Override
    public int hashCode() {
        int result = ip.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + event.hashCode();
        result = 31 * result + status.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry)) return false;
        Entry entry = (Entry) o;
        if (!ip.equals(entry.ip) || !name.equals(entry.name) || !date.equals(entry.date) || status != entry.status) return false;
        return event == entry.event;
    }

    @Override
    public String toString() {
        return "Log{ ip='" + ip + '\'' + ", user='" + name + '\'' + ", date=" + date + ", event=" + event + ", status=" + status + '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }
}