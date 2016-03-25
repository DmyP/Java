package week2.sorting.algorithm;

import week2.sorting.Array;
import week2.sorting.Sorter;

public class CocktailSorter implements Sorter {

    @Override
    public void sort(Array data) {
        int size = data.size();

        //границы сортировки
        int left = 1;
        int right = size - 1;

        //место последней перестановки
        int last = size - 1;

        do {
            //Сдвигаем к концу массива "легкие элементы"
            for (int i = right; i >= left; i--) {
                if (data.get(i - 1).compareTo(data.get(i)) > 0) {
                    data.swap(i, i - 1);
                    last = i; //Запомнить место последней перестановки
                }
            }

            left = last + 1;

            //Сдвигаем к началу массива "тяжелые элементы"
            for (int i = left; i <= right; i++) {
                if (data.get(i - 1).compareTo(data.get(i)) > 0) {
                    data.swap(i, i - 1);
                    last = i; //Запомнить место последней перестановки
                }
            }

            right = last - 1;
        } while (left <= right);
    }
}
