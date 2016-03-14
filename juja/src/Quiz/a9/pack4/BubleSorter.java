
package ua.com.juja.a9.pack4;

/**
 * Created by indigo on 10.08.2015.
 */
public class BubleSorter {

    private Comparator comparator;

    public BubleSorter(Comparator comparator) {
        this.comparator = comparator;
    }

    public Object[] sort(Object[] input) {
        Object[] result = new Object[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i];
        }

        for (int c = 0; c < input.length - 1; c++) {
            for (int d = 0; d < input.length - c - 1; d++) {
                if (comparator.compare(result[d], result[d+1])) {
                    Object swap = result[d];
                    result[d]   = result[d+1];
                    result[d+1] = swap;
                }
            }
        }
        return result;
    }
}
