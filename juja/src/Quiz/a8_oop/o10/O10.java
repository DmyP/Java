package Quiz.a8_oop.o10;

public class O10 {
}

class Parent {
    String first() {
        return second;
    }

    String second = "Parent";
}

class Child extends Parent {
    String second = "Child";
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}