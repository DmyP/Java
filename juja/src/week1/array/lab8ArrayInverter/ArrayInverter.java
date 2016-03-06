package week1.array.lab8ArrayInverter;
/*
В коде инвертирования массива

public class ArrayInverter {
    public static void invert(int[] arr) {
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
    }
}
необходимо переписать цикл с инкремента счетчика от 0 до середины массива на цикл от середины массива
до 0 (инкремент (k++) заменить на декремент (k--)).
 */
public class ArrayInverter {
    public static void main(String[] args) {
        int i[] =  {1,2,3,4,5};
        for(int j = 0; j<i.length; j++)
            System.out.println(j + " " + i[j]);
        invert(i);
        for(int j = 0; j<i.length; j++)
            System.out.println(j + " " + i[j]);
    }
    public static void invert(int[] arr) {
        if (arr.length > 0){
            for (int k = arr.length / 2; k > 0; k--) {
                int tmp = arr[k -1];
                arr[k -1] = arr[arr.length - k ];
                arr[arr.length - k ] = tmp;
            }
        }
    }

}
