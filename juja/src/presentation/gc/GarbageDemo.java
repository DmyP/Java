package presentation.gc;

public class GarbageDemo {
    public static void main(String[] args) {
        for (int k = 0; k < 256; k++) {
            System.out.println(k);
            Object ref = new byte[1_000_000];
        }
    }
}