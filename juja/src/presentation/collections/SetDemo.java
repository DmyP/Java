package presentation.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    private final static String[] DAYS_OF_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
            "Sunday"};

    public static void main(String[] args) {
        Set<presentation.collections.Element1> set = new HashSet<presentation.collections.Element1>();
        set.add(new Element1());
        set.add(new Element1());
        System.out.println(set);
    }
}

class Element {
    private static int lastID = 0;

    private int id = lastID++;

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "element" + id;
    }
}

class Element1 {
    private static int lastID = 0;

    private int id = lastID++;

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "element" + id;
    }
}



