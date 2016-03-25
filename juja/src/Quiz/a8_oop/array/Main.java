package Quiz.a8_oop.array;

import java.util.Arrays;

/**
 * Created by indigo on 07.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

//        array.remove(5);
//        int[] array2 = new int[array.length - 1];
//        for (int i = 0; i < 5; i++) {
//            array2[i] = array[i];
//        }
//        for (int i = 6; i < array.length; i++) {
//            array2[i - 1] = array[i];
//        }

//        array.add(3, 7);
        int[] array2 = new int[array.length + 1];
        for (int i = 0; i < 3; i++) {
            array2[i] = array[i];
        }
        array2[3] = 7;
        for (int i = 3; i < array.length; i++) {
            array2[i + 1] = array[i];
        }

        System.out.println(Arrays.toString(array2));
    }
}
