package Quiz.a6_oop.coins;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MatrixCoinsChangerTest {

    @Test
    public void test() {
        assertEquals(4, MatrixCoinsChanger2.getCombinations(5));
        assertEquals(11, MatrixCoinsChanger2.getCombinations(10));
        assertEquals(3_953, MatrixCoinsChanger2.getCombinations(100));
        assertEquals(233_639, MatrixCoinsChanger2.getCombinations(278));
        assertEquals(514_766, MatrixCoinsChanger2.getCombinations(333));
        assertEquals(589_078_306, MatrixCoinsChanger2.getCombinations(1500));
        assertEquals(590_975_971, MatrixCoinsChanger2.getCombinations(1501));
    }
}
