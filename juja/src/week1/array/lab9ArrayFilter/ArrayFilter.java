package week1.array.lab9ArrayFilter;

import java.util.Arrays;

/*
Отфильтровать массив так, чтобы оставить только четные элементы. Для проверки четности можно использовать операцию
остаток от деления - %
3 % 2 == 1; 6 % 2 == 0;
Исходящий массив для простоты, должен быть того же размера, что и входящий. Например,
для {4, 3, 5, 6, 7, 9} -> {4, 6, 0, 0, 0, 0}
*/
public class ArrayFilter {
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,7,3};
        filterEven(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] filterEven(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] = 0;
            } else {
                nums[j] = nums[i];
                if(i > 0)
                    nums[i] = 0;
                j++;

            }
        }
        return nums;
    }
}
