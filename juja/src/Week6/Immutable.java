package Week6;

public class Immutable {
    public static void main(String[] args) {
        String str0 = "Hello!";
        String str1 = new String(str0).intern();
        System.out.println(str0 == str1);
    }
}

