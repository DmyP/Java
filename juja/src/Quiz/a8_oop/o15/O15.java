package Quiz.a8_oop.o15;

public class O15 {
}

class Parent {
    static String first() {
        return /*Parent.*/second;
    }
    static String second = "Parent";
}
class Child extends Parent {
    static String second = "Child";
//    static String first() {
//        return /*Parent.*/second;
//    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}