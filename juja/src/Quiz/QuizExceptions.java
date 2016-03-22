package Quiz;

public class QuizExceptions {
    public static void main(String[] args) throws Throwable {
        try {
            throw new Exception();
        } catch (RuntimeException t) {
            // nothing
        }
    }
}
