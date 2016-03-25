package week2.sorting.algorithm;

import week2.sorting.Array;
import week2.sorting.Element;
import week2.sorting.Sorter;

public class InsertionSorter implements Sorter {

    @Override
    public void sort(Array data) {
        int size = data.size();

        for (int i = 1; i < size; i++) {
            Element key = data.get(i);
            int j = i - 1;
            while (j >= 0 && data.get(j).compareTo(key) > 0) {
                data.copy(j, j + 1);
                j = j - 1;
            }
            data.set(j + 1, key);
        }
    }
}
