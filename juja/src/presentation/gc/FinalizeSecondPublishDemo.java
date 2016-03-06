package presentation.gc;

public class FinalizeSecondPublishDemo {

    static Object ref;
    volatile static boolean finalized = false;

    public static void main(String[] args) {
        new Object() {
            @Override
            protected void finalize() throws Throwable {
                System.out.println("finalize() " + super.toString());
                Thread.sleep(1000);
                ref = this;
                finalized = true;
            }
        };

        System.out.println(ref);

        while (!finalized) {
            byte[] b = new byte[1000];
        }

        System.out.println(ref.toString());
    }
}
