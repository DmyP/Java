package Quiz.a8_oop.o7;

public class O7 {
}

class SuperParent {
    SuperParent() {
        System.out.println("SuperParent()");
    }
}

class Parent extends SuperParent{
//    Parent() {
//        super();
//    }
}

class Child extends Parent {
//    Child() {
//        super();
//    }
}

class Test {
    public static void main(String[] args) {
        new Child();
    }
}