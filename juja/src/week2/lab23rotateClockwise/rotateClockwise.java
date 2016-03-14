package week2.lab23rotateClockwise;
/*
Реализуйте метод rotateClockwise класса ArrayUtils, который

1. Проверяет, что метод получил "кубическую" матрицу (допустимые размеры 1x1x1, 2x2x2, 3x3x3, ...)
иначе возвращает null; (возможные ошибки: аргумент равен null, "длина" / "ширина" / "высота" не равны,
есть строки разной длины, есть строки с null вместо одномерных/двумерных массивов ...)
2. "Проворачивает куб" относительно главной диагонали проходящей от элемента [0][0][0] до элемента
[L-1][L-1][L-1] (L - длина "грани куба") массив по часовой стрелке на 120 градусов (по часовой стрелке
- если смотреть вдоль оси от элемента [L-1][L-1][L-1] в сторону элемента [0][0][0]),
То есть
[[[1]]] -> [[[1]]]
[  [[1, 2], [3, 4]], [[5, 6], [7, 8]] ] -> [ [[1, 5], [2, 6]], [[3, 7], [4, 8]] ]
[ [[10, 11, 12], [20, 21, 22], [30, 31, 32]], [[40, 41, 42], [50, 51, 52], [60, 61, 62]], [[70, 71, 72],
[80, 81, 82], [90, 91, 92]] ] ->
[ [[10, 40, 70], [11, 41, 71], [12, 42, 72]], [[20, 50, 80], [21, 51, 81], [22, 52, 82]], [[30, 60, 90],
[31, 61, 91], [32, 62, 92]] ] ...
 */
public class rotateClockwise {
    public static void main(String[] args) {
        int[][][] array3 = {{{10, 11, 12}, {20, 21, 22}, {30, 31, 32}},
                            {{40, 41, 42}, {50, 51, 52}, {60, 61, 62}},
                            {{70, 71, 72}, {80, 81, 82}, {90, 91, 92}}};
  /*      int[][][] array = {{{1}}};
       int[][][] array2 = {{{1, 2}, {3, 4}},
                            {{5, 6}, {7, 8}} };
        int[][][] res2   = {{{1, 5}, {2, 6}},
                            {{3, 7}, {4, 8}} };


        int[][][] res3 =   {{{10, 40, 70}, {11, 41, 71}, {12, 42, 72}},
                            {{20, 50, 80}, {21, 51, 81}, {22, 52, 82}},
                            {{30, 60, 90}, {31, 61, 91}, {32, 62, 92}}};
*/        int[][][] result = rotateClockwise(array3);

//        int[][][] result = rotateClockwise(new int [][][]{{{0, 0}, {0, 0}}, {{0, 0}, {0, 0}, {0, 0}}});
        int k;
    }
    public static int[][][] rotateClockwise(int arg[][][]){
        if ((arg == null) || (arg.length == 0) || (arg[0] == null)) return null;
        if (arg.length != arg[0].length) return null;
        if (arg[0][0] == null) return null;
        if (arg[0].length != arg[0][0].length) return null;
        if ((arg.length == 2) && arg[0].length != arg[1].length) return null;
        if ((arg.length == 2) && arg[0].length != arg[1][1].length) return null;
      //  if (arg.length == 1 && arg[0].length == 1) return arg;

        int[][][] res = new int[arg.length][arg.length][arg.length];
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg.length; j++) {
                for (int k = 0; k < arg.length; k++) {
                    res[i][j][k] = arg[k][i][j];
                }
//                System.out.print(" i = " + i + " j = " + j + "\t" +  arg[i][j][0] + " " +  arg[i][j][1]);
//                System.out.print("\t\t\t res =  " + "\t\t" +  res[i][j][0] + " " +  res[i][j][1] + "\n");
//              System.out.print(" i = " + i + " j = " + j + "\t" +  arg[i][j][0] + " " +  arg[i][j][1] + " " +  arg[i][j][2]);
//              System.out.print("\t\t\t res =  " + "\t\t" +  res[i][j][0] + " " +  res[i][j][1] + " " +  arg[i][j][2] + "\n");
            }
        }

        return res;
    }

}
