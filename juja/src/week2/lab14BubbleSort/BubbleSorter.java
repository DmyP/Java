package week2.lab14BubbleSort;

/*
Алгоритм "сортировки пузырьком"
допускает вариации и оптимизации. В данном случае приведен алгоритм, при котором на каждом проходе "всплывает"
самый большой элемент. Перепишите алгоритм на такой, при котором "тонет" самый маленький элемент. Порядок
сортировки должен сохраниться - по возрастанию. Элементы должны перебираться справа - налево. Всплывал - вправо,
тонет - влево. Цикл не доходил до правого конца, теперь - не доходит до левого. В массиве из 6 элементов должны
сравниваться (и в случае инверсии переставляться) пары 4-5 3-4 2-3 1-2 0-1 4-5 3-4 2-3 1-2 4-5 3-4 2-3 4-5 3-4 4-5
*/
public class BubbleSorter {

    public static void main(String[] args) {
        int []i = {1, 3, 4, 2,  -2};
        sort(i);
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j]);
        }
    }

    public static void sort(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = arr.length - 1; index > 0; index--) {
                if (arr[index] < arr[index - 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = tmp;
                }
            }
        }
    }

}
