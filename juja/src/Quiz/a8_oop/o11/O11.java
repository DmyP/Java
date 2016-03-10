package Quiz.a8_oop.o11;

public class O11 {
}

class Parent {
    String first() {
        return /*this.*/second();
    }
    String second() {
        return "Parent";
    }
}
class Child extends Parent {
    String second() {
        return "Child";
    }
//    String first() {
//        return /*this.*/second();
//    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}