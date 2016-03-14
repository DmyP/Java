package Mirror;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Mirror {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[arr.length - 1].length; j++) {
                arr[i][j] = k++;
            }
        }
        Mirror mirror = new Mirror();
        mirror.prn(arr);

        mirror.d2(arr);
//       mirror.d1(arr);

//        mirror.leftRight(arr);
//        mirror.upDown(arr);
//        mirror.upDown(arr);
        mirror.prn(arr);

    }

    public void upDown(int[][] array) {

        if (!valid(array)) {
            return;

        }

        for (int x = 0; x < array.length; x++) {
            int y1 = 0;
            int y2 = array.length - 1;

            while (y1 < y2) {
                swapY(array, x, y1, y2);
                y1++;
                y2--;
            }
        }
    }

    private void prn(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("\n");
    }

    private boolean valid(int[][] array) {
        if (array == null || (array.length != 0 && (array.length != array[array.length - 1].length))) return false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length == 0 || array[0].length != array[i].length || array[i] == null) return false;
        }


        return true;
    }

    private void swapY(int[][] array, int x, int y1, int y2) {
        int temp = array[y1][x];
        array[y1][x] = array[y2][x];
        array[y2][x] = temp;
    }

    public void leftRight(int[][] array) {
        if (!valid(array)) {
            return;
        }

        for (int y = 0; y < array.length; y++) {
            int x1 = 0;
            int x2 = array.length - 1;

            while (x1 < x2) {
                swapX(array, y, x1, x2);
                x1++;
                x2--;
            }
        }
    }

    private void swapX(int[][] array, int y, int x1, int x2) {
        int temp = array[y][x1];
        array[y][x1] = array[y][x2];
        array[y][x2] = temp;
    }

    public void all(int[][] array) {
        if (!valid(array)) {
            return;
        }

        upDown(array);
        leftRight(array);
    }

    public void d1(int[][] array) {
        if (!valid(array)) {
            return;
        }
        int ii = array.length - 1;
        int jj = array.length - 1;
        int[][] temp = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                temp[i][j] = array[jj][ii];
                jj--;
            }
            jj = array.length - 1;
            ii--;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = temp[i][j];
            }
            // TODO implement me (TDD)
        }
    }

    public void d2(int[][] array) {
        if (!valid(array)) {
            return;
        }
        int ii = array.length - 1;
        int jj = array.length - 1;
        int[][] temp = new int[array.length][array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array.length - 1; j >= 0;  j--) {
                temp[i][j] = array[jj][ii];
                jj--;
            }
            jj = array.length - 1;
            ii--;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = temp[i][j];
            }
            // TODO implement me (TDD)
        }
    }
}