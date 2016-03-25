package week2.sorting.algorithm;

import week2.sorting.Array;
import week2.sorting.Sorter;

public class BubbleFlaggedSorter implements Sorter {

    @Override
    public void sort(Array data) {
        int size = data.size();
        for (int j = 0; j < size - 1; j++) {
            boolean f = false;
            for (int i = 0; i < size - j - 1; i++) {
                if (data.get(i).compareTo(data.get(i + 1)) > 0) {
                    data.swap(i, i + 1);
                    f = true;
                }
            }
            if (!f) {
                break;
            }
        }
    }
}
