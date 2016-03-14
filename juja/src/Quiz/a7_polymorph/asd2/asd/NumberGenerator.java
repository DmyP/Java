package Quiz.a7_polymorph.asd2.asd;

/**
 * Created by indigo on 31.07.2015.
 */
public class NumberGenerator {
    private static int number = 1;

    public static int next() {
        int result = number;
        number++;
        return result;
    }
}
