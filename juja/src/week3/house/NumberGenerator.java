package week3.house;

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
