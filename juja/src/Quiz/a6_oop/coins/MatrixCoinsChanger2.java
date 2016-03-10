package Quiz.a6_oop.coins;

public class MatrixCoinsChanger2 {

    private static final int[] coinNominals = new int[]{1, 2, 5, 10, 25, 50};
    private static int[][] combinations;

    public static void main(String[] args) {
//        final int[] coinNominals = new int[]{1, 2, 5, 10, 25, 50};
//        {
//            {
//                {
//                    final int[] coinNominals2 = new int[100];
//                    coinNominals2[6] = 56;
//                    coinNominals2 = new int[10];
//                }
//            }
//        }
        System.out.println(getCombinations(5));
    }
    /**
     * ��������� N-�� ��������� a0, a1, a2, a3, ... ,am =
     * ���������� ���������� ��� ��������� N-�� ��������� a0...a(m-1)
     *    ��� �������, ��� m > 0
     * +
     * ���������� ����������, ��� ��������� (N-�� - ������� ������� am)
     *    ��� ������� ��� ������� ������ = 0
     */
    public static int getCombinations(int sum) {
        if (sum <= 0) return 0;

        int nominalsCount = coinNominals.length;
        combinations = new int[sum + 1][nominalsCount];

        for (int i = 0; i < nominalsCount; i++) {
            combinations[0][i] = 1;
        }

        for (int number = 1; number <= sum; number++) {
            for (int nominalsIndex = 0; nominalsIndex < nominalsCount; nominalsIndex++) {
                int current = 0;
                if (coinNominals[nominalsIndex] <= number) {
                    int rest = number - coinNominals[nominalsIndex];
                    current = combinations[rest][nominalsIndex];
                }

                int previous = 0;
                if (nominalsIndex >= 1) {
                    previous = combinations[number][nominalsIndex - 1];
                }

                combinations[number][nominalsIndex] = current + previous;
//                debug(combinations, coinNominals);
            }
        }
        return combinations[sum][nominalsCount - 1];
    }

    private static void debug(int[][] cache, int[] coinNominals) {
        String result = "\t\t";
        for (int x = 0; x < coinNominals.length; x++) {
            result += coinNominals[x] + "\t";
        }
        result += '\n';

        for (int y = 0; y < cache.length; y++) {
            result += "[" + y + "] \t";
            for (int x = 0; x < coinNominals.length; x++) {
                result += cache[y][x] + "\t";
            }
            result += '\n';
        }
        System.out.println(result);

        // [0]  1 2 3 4
        // [1]  2 3 4 5
        // [2]  5 6 7 8
    }

    public static int getCombinations(int number, int countNominals) {
        return combinations[number][countNominals];
    }

//    public static void setCombinations(int number, int countNominals, int value) {
//        combinations[number][countNominals] = value;
//    }
//
//    public static void setCombinations(int[][] ints) {
//        combinations = ints;
//    }
}