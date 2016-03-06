package week4.test2;

public class App {

    public void f() {
        X x = new X() {
            @Override
            public String toString() {
                return "Hello!";
            }
        };
    }

    public static class X {

    }
}