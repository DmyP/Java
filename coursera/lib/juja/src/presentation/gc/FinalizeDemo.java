package presentation.gc;

public class FinalizeDemo {
    public static void main(String[] args) {
        new Object() {
            protected void finalize() throws Throwable {
                System.out.println("finalize()");
            }
        };
        while (true) ;
    }
}
