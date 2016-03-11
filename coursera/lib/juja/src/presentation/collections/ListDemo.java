package presentation.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    private final static String[] DAYS_OF_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
            "Sunday"};

    public static void main(String[] args) {
        List<java.io.Serializable> daysOfWeek = new ArrayList<java.io.Serializable>();
        daysOfWeek.addAll(Arrays.asList(DAYS_OF_WEEK));
        System.out.println(daysOfWeek);
        daysOfWeek.add("Friday");
        System.out.println(daysOfWeek);
        System.out.println(daysOfWeek.contains("Tuesday"));
        System.out.println(daysOfWeek.contains("tuesday"));
        daysOfWeek.add(0, "Sunday");
        System.out.println(daysOfWeek);
        daysOfWeek.add(2, null);
        daysOfWeek.add(Integer.valueOf(3));
        System.out.println(daysOfWeek);
    }
}
