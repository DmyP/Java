package week2.test;

public class ArrayCopy {

    public static void main(String[] args) {

        int arr1[] = { 0, 1, 2, 3, 4, 5 };
        int arr2[] = { 0, 10, 20, 30, 40, 50 };

        // copies an array from the specified source array
        System.arraycopy(arr1, 0, arr2, 0, 3);
        System.out.print("array1 = ");
        System.out.print(arr1[0] + " ");
        System.out.print(arr1[1] + " ");
        System.out.print(arr1[2] + " ");
        System.out.print(arr1[3] + " ");
        System.out.print(arr1[4] + " ");

        System.out.println("array2 = ");
        System.out.print(arr2[0] + " ");
        System.out.print(arr2[1] + " ");
        System.out.print(arr2[2] + " ");
        System.out.print(arr2[3] + " ");
        System.out.print(arr2[4] + " ");
    }
}
