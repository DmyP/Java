package ua.com.juja;

/**
 * Created by apofig on 2015-08-13.
 */
public class NumberGenerator {
    private int current;

    public NumberGenerator() {
        current = 1;
    }

    public int getNext() {
        int result = current;
        current++;
        return result;
    }
}
