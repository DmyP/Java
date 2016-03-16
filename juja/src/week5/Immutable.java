package week5;

public class Immutable {
    public static void main(String[] args) {
        Integer integer = -1;
        System.out.println(integer);
        integer = new Integer(123) + new Integer(234);
        System.out.println(integer);

        System.out.println(new Object() == new Object());
        System.out.println(new Integer(99) == new Integer(99));
        System.out.println(Integer.valueOf(199) == Integer.valueOf(199));

        Integer i0 = 100;
        Integer i1 =  Integer.valueOf(100);
        System.out.println(i0 == i1);

    }

}
