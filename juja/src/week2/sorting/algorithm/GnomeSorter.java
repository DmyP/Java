package week2.sorting.algorithm;

import week2.sorting.Array;
import week2.sorting.Sorter;

public class GnomeSorter implements Sorter {

    @Override
    public void sort(Array data) {
        int size = data.size();

        int i = 1;
        int j = 2;
        while (i < size) {
            //для сортировки по убыванию поменяйте знак сравнения на >=
            if (data.get(i - 1).compareTo(data.get(i)) <= 0) {
                i = j;
                j = j + 1;
            } else {
                data.swap(i - 1, i);
                i = i - 1;
                if (i == 0) {
                    i = j;
                    j = j + 1;
                }
            }
        }
    }
}
