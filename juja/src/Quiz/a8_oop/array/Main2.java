package Quiz.a8_oop.array;

/**
 * Created by indigo on 07.08.2015.
 */
public class Main2 {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);

        System.out.println(array.toString());
//        System.out.println(Arrays.toString(array2));

        array.remove(5);
        System.out.println(array.toString());
//        int[] array2 = new int[array.length - 1];
//        for (int i = 0; i < 5; i++) {
//            array2[i] = array[i];
//        }
//        for (int i = 6; i < array.length; i++) {
//            array2[i - 1] = array[i];
//        }

        array.add(3, 7);
        System.out.println(array.toString());
//        int[] array2 = new int[array.length + 1];
//        for (int i = 0; i < 3; i++) {
//            array2[i] = array[i];
//        }
//        array2[3] = 7;
//        for (int i = 3; i < array.length; i++) {
//            array2[i + 1] = array[i];
//        }

    }
}
