package Mirror;

public class Mirror {

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

    private boolean valid(int[][] array) {

        if (array == null || array[0] == null || array.length != array[0].length) return false;
        if (array[1] != null && array[0].length != array[1].length) return false;


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

        // TODO implement me (TDD)
    }

    public void d2(int[][] array) {
        if (!valid(array)) {
            return;
        }

        // TODO implement me (TDD)
    }
}
