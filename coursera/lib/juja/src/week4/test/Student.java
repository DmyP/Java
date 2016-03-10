package week4.test;

public class Student extends Person {
    public void f1() {
        System.out.println("S1");
        super.f1();
        f2();
    }

    public void f2() {
        System.out.println("S2");
    }
}