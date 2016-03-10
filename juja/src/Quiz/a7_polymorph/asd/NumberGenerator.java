package Quiz.a7_polymorph.asd;

public class NumberGenerator {
    private static int number = 1;

    public static int next() {
        int result = number;
        number++;
        return result;
    }
}
