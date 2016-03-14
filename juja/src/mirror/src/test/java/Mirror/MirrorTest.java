package Mirror;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MirrorTest {

    @Test
    public void testUpDown_whenArraySizeIs0() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[0][0];

        // when
        mirror.upDown(array);

        // then
        assertEquals("", toString(array));
    }

    @Test
    public void testUpDown_whenArraySizeIs1() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[1][1];

        array[0][0] = 13;

        // when
        mirror.upDown(array);

        // then
        assertEquals("13\n", toString(array));
    }

    @Test
    public void testUpDown_whenArraySizeIs2() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[2][2];

        // 12
        // 34
        array[0][0] = 1;
        array[1][0] = 3;
        array[0][1] = 2;
        array[1][1] = 4;

        assertEquals(
                "12\n" +
                "34\n", toString(array));

        // when
        mirror.upDown(array);

        // then
        assertEquals(
                "34\n" +
                "12\n", toString(array));
    }

    @Test
    public void testUpDown_whenArraySizeIs2_case2() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[2][2];

        // 98
        // 76
        array[0][0] = 9;
        array[1][0] = 7;
        array[0][1] = 8;
        array[1][1] = 6;

        assertEquals(
                "98\n" +
                "76\n", toString(array));

        // when
        mirror.upDown(array);

        // then
        assertEquals(
                "76\n" +
                "98\n", toString(array));
    }

    @Test
    public void testUpDown_whenArraySizeIs3() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[3][3];

        // 123
        // 456
        // 789
        array[0] = new int[] {1, 2, 3};
        array[1] = new int[] {4, 5, 6};
        array[2] = new int[] {7, 8, 9};

        assertEquals(
                "123\n" +
                "456\n" +
                "789\n", toString(array));

        // when
        mirror.upDown(array);

        // then
        assertEquals(
                "789\n" +
                "456\n" +
                "123\n", toString(array));
    }

    @Test
    public void testUpDown_whenArraySizeIs4() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[4][4];

        //  1  2  3  4
        //  5  6  7  8
        //  9 10 11 12
        // 13 14 15 16
        array[0] = new int[] {1, 2, 3, 4};
        array[1] = new int[] {5, 6, 7, 8};
        array[2] = new int[] {9, 10, 11, 12};
        array[3] = new int[] {13, 14, 15, 16};

        assertEquals(
                "1234\n" +
                "5678\n" +
                "9101112\n" +
                "13141516\n", toString(array));

        // when
        mirror.upDown(array);

        // then
        assertEquals(
                "13141516\n" +
                "9101112\n" +
                "5678\n" +
                "1234\n", toString(array));
    }

    @Test
    public void testUpDown_whenArraySizeIs5() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[5][5];

        //  1  2  3  4   5
        //  6  7  8  9  10
        //  11 12 13 14 15
        //  16 17 18 19 20
        //  21 22 23 24 25
        array[0] = new int[] {1, 2, 3, 4, 5};
        array[1] = new int[] {6, 7, 8, 9, 10};
        array[2] = new int[] {11, 12, 13, 14, 15};
        array[3] = new int[] {16, 17, 18, 19, 20};
        array[4] = new int[] {21, 22, 23, 24, 25};

        assertEquals(
                "12345\n" +
                "678910\n" +
                "1112131415\n" +
                "1617181920\n" +
                "2122232425\n", toString(array));

        // when
        mirror.upDown(array);

        // then
        assertEquals( // TODO подумать над этим безобразием :)
                "2122232425\n" +
                "1617181920\n" +
                "1112131415\n" +
                "678910\n" +
                "12345\n", toString(array));
    }

    @Test
    public void testLeftRight_whenArraySizeIs2() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[2][2];

        // 12
        // 34
        array[0] = new int[] {1, 2};
        array[1] = new int[] {3, 4};

        assertEquals(
                "12\n" +
                "34\n", toString(array));

        // when
        mirror.leftRight(array);

        // then
        assertEquals(
                "21\n" +
                "43\n", toString(array));
    }

    @Test
    public void testLeftRight_whenArraySizeIs1() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[1][1];

        // 12
        // 34
        array[0][0] = 1;

        assertEquals(
                "1\n", toString(array));

        // when
        mirror.leftRight(array);

        // then
        assertEquals(
                "1\n", toString(array));
    }

    @Test
    public void testLeftRight_whenArraySizeIs3() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[3][3];

        // 123
        // 456
        // 789
        array[0] = new int[] {1, 2, 3};
        array[1] = new int[] {4, 5, 6};
        array[2] = new int[] {7 ,8, 9};

        assertEquals(
                "123\n" +
                "456\n" +
                "789\n", toString(array));

        // when
        mirror.leftRight(array);

        // then
        assertEquals(
                "321\n" +
                "654\n" +
                "987\n", toString(array));
    }

    @Test
    public void testAll_whenArraySizeIs2() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[2][2];

        // 12
        // 34
        array[0] = new int[] {1, 2};
        array[1] = new int[] {3, 4};

        assertEquals(
                "12\n" +
                "34\n", toString(array));

        // when
        mirror.all(array);

        // then
        assertEquals(
                "43\n" +
                "21\n", toString(array));
    }

    @Test
    public void testAll_whenArraySizeIs3() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[3][3];

        // 123
        // 456
        // 789
        array[0] = new int[] {1, 2, 3};
        array[1] = new int[] {4, 5, 6};
        array[2] = new int[] {7 ,8, 9};

        assertEquals(
                "123\n" +
                "456\n" +
                "789\n", toString(array));

        // when
        mirror.all(array);

        // then
        assertEquals(
                "987\n" +
                "654\n" +
                "321\n", toString(array));
    }

    private String toString(int[][] array) {
        String result = "";

        int size = array.length;

        for (int y = 0; y < size; y++) {
            int[] row = array[y];
            if (row.length != size) {
                fail("Массив не квадратный");
            }
            for (int x = 0; x < size; x++) {
                result += array[y][x];
            }
            result += "\n";
        }

        return result;
    }

}
