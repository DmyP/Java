package Quiz.a8_oop.o16;

public class O16 {
}

class Parent {
    static String first() {
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
//    static String first() {
//        return /*Parent.*/second();
//    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(Child.first());
    }
}