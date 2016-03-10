package Quiz.a6_oop;

import Quiz.a6_oop.coins.MatrixCoinsChanger2;

public class Cashier {

    public static void main(String[] args) {
        MatrixCoinsChanger2.getCombinations(1000);

        // {1, 2, 5, 10, 25, 50}
        //  0  1  2  3   4   5
        System.out.println(MatrixCoinsChanger2.getCombinations(64, 3));
        System.out.println(MatrixCoinsChanger2.getCombinations(640, 3));
        System.out.println(MatrixCoinsChanger2.getCombinations(56, 4));
        System.out.println(MatrixCoinsChanger2.getCombinations(23, 3));
        System.out.println(MatrixCoinsChanger2.getCombinations(534, 2));
        System.out.println(MatrixCoinsChanger2.getCombinations(61, 1));
        System.out.println(MatrixCoinsChanger2.getCombinations(63, 4));

//        MatrixCoinsChanger2.setCombinations(new int[1][1]);
//        MatrixCoinsChanger2.setCombinations(2, 3, 323214);
    }
}
