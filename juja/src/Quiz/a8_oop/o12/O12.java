package Quiz.a8_oop.o12;

public class O12 {
}

class Parent {
    String first() {
        return Parent.second;
    }
    static String second = "Parent";
}
class Child extends Parent {
    static String second = "Child";

}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}