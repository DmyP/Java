package week2.lab15SelectionSorter;
import java.util.Arrays;
import java.util.Random;
/*
Переписать алгоритм сортировки выборками:

public class SelectionSorter {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;}}}}}

1. Убрать обмен элементами arr[barrier] c arr[index] каждый раз, когда находится очередной меньший элемент. Найти наименьший элемент во всем массиве - и обменять с ним.
2. Убрать обращение во внутреннем цикле к элементу массива arr[barrier]. Вычитать значение ячейки массива в локальную переменную (за пределами внутреннего цикла) и использовать ее (во внутреннем цикле).
В моих экспериментах:

пункт #1 ускорил сортировку в 2 раза.

пункт #2 ускорил сортировку еще на 10%-20%.
 */

public class SelectionSorter {
    public static void main(String[] args) {

        //array = new int[]{1, -2, 0, 14, 0, 5};
        Random rnd = new Random(0);
        int[] array = new int[10];
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
           array[i] = rnd.nextInt(1000);
           array2[i] = array[i];
        }

        System.out.println("Array before sort" + Arrays.toString(array));
        sort(array);
        sort2(array2);
        System.out.println("Array after sort min bubble      " + Arrays.toString(array));
        System.out.println("Array2 after sort standart bubble" + Arrays.toString(array));

    }

    public static void sort(int[] arr) {
        int count = 0, minInd = 0;
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier; index < arr.length; index++) {
                if (arr[index] < arr[minInd]) {
                    minInd = index;
                }
            }
            int tmp = arr[barrier];
            arr[barrier] = arr[minInd];
            arr[minInd] = tmp;
            minInd = barrier+1;
            count++;
        }
        System.out.println("Steps in min method -       " + count);
    }

    public static void sort2(int[] arr) {
        int count = 0;
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
                count++;
            }
        }
        System.out.println("Steps in standart method - " + count);
    }

}
