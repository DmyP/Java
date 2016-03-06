package presentation.method;

public class VarargsDemo {
    public static void main(String[] args) {
        printStringArray(null, args);
        System.out.println();
        printStringArray(null, "1", "2", "3");
    }

    public static void printStringArray(int[] numbers, String... strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }

}
