package Quiz.a8_oop.o13;

public class O13 {
}

class Parent {
    String first() {
        return /*Parent.*/second();
    }
    static String second() {
        return "Parent";
    }
}
class Child extends Parent {
    static String second() {
        return "Child";
    }
//    String first() {
//        return /*Parent.*/second();
//    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}