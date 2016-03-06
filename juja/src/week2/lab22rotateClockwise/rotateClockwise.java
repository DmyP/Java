package week2.lab22rotateClockwise;

import java.util.Arrays;

/*
Реализуйте метод rotateClockwise(int[][]) класса ArrayUtils, который
1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...)
иначе возвращать null; (возможные ошибки: null вместо массива, одна из размерностей = 0, длина не равна ширине,
есть строки разной длины, есть строки с null вместо одномерных массивов)
2) "проворачивает" массив по часовой стрелке на 90 градусов, т.е
[1] -> [1] [[1, 2], [3, 4]] -> [[3, 1], [4, 2]] [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]] ...
 */
public class rotateClockwise {
    public static void main(String[] args) {
        //int[][] array = {{1}};
        //int[][] array = {{}, {}};
        //int[][] array = {{1, 2}, {3, 4}};
        //int[][] array = {{1, 2}, null};
        //int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array = {{0, 0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] result = rotateClockwise(array);
        //int[][] result = rotateClockwise(new int[][] {{0, 0}, {0}});
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public static int[][] rotateClockwise(int arg[][]){


        if ((arg == null) || (arg.length == 0) || (arg[0] == null)) return null;

        if ((arg.length == 2) && ((arg[1] == null) || (arg[1][0] == 0))) return null;

        if (arg.length == 1 && arg[0].length == 1) return arg;

        if (arg.length != arg[0].length) return null;

        int[][] res = new int[arg[0].length][arg.length];
        for (int i = 0; i < arg[0].length; i++) {
            for (int j = 0; j < arg.length; j++) {
                res[j][arg[0].length - 1 - i] = arg[i][j];
                }
            }

        return res;
    }
}
