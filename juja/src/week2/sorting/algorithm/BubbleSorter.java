package week2.sorting.algorithm;

import week2.sorting.Array;
import week2.sorting.Sorter;

public class BubbleSorter implements Sorter {

    @Override
    public void sort(Array data) {
        int size = data.size();
        for (int j=0; j < size - 1; j++) {
            for (int i=0; i < size - j - 1; i++) {
                if (data.get(i).compareTo(data.get(i+1)) > 0) {
                    data.swap(i, i+1);
                }
            }
        }
    }

    public void sort(int[] data) {
        int n = data.length;
        for (int j=0; j < n - 1; j++) { // O(n)
            for (int i=0; i < n - j - 1; i++) { // O(n/2)
                if (data[i] > data[i+1]) {
                    int temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
        }
    }
}
