package ua.com.juja.a9.pack4;

/**
 * Created by indigo on 10.08.2015.
 */
public class ToStringComparator implements Comparator {
    @Override
    public boolean compare(Object o1, Object o2) {
        return o1.toString().length() > o2.toString().length();
    }
}
