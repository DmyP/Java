package Quiz.a6_oop;

public class SuperQuestion {
    // �������� ��������� ��� super(). ������ ���� ��������� ���� � � �������� ������� ����, ���������, ��� ������� ����������� class A {
    class A1{
        A1() {}
        A1(int k) {super();}
    }
    class B1 extends A1 {
        B1() {}
        B1(int k) {super();}
    }

    // � ��� �:

//    class A2 {
//        A2(){super(0);}
//        A2(int k) {super(0);}
//    }
//    class B2 extends A2 {
//        B2() {super(0);}
//        B2(int k) {super(0);}
//    }
}
