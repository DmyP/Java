package week1.yummy.lab12ArrayUtils;
/*
На вход подается одномерный массив. Необходимо, найти диапазон максимальной ширины, элементы которого положительные (больше 0)
В качестве ответа должен быть массив из 2х элементов, где
- элемент №0 - индекс элемента левой границы отрезка
- элемент №1 - индекс элемента правой границы отрезка
Если таких отрезков несколько - вернуть самый левый. Если в массиве нету такого отрезка (все числа отрицательны) - вернуть пустой массив.
Например
lookFor([1, 1, 1]) = [0, 2]
lookFor([0, 1, 1]) = [1, 2]
lookFor([1, 1, 0]) = [0, 1]
lookFor([0, -100, 1, 1, 0, -1]) = [2, 3]
lookFor([1, 1, 0, 1, 1]) = [0, 1] // возвращаем левый
lookFor([0, -1, 0, -1]) = [] // нету положительных чисел
 */
public class ArrayUtils {
    public static void main(String[] args) {
        int[] a, b;
        a = new int[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        b = lookFor(a);

    }

    public static int[] lookFor(int[] array) {
        int res[] = new int[2];
        int begin = 0, end = 0, lengthCur = 0, lengthMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (lengthCur == 0) {
                    begin = i;
                }
                lengthCur += 1;
                end = i;
            } else if (lengthCur > lengthMax) {
                lengthMax = lengthCur;
                res[0] = begin;
                res[1] = end;
                lengthCur = 0;
            }else lengthCur = 0;
        }
        if (lengthCur > lengthMax) {
            lengthMax = lengthCur;
            res[0] = begin;
            res[1] = end;
        }else lengthCur = 0;

        if (lengthMax == 0) {
            return new int[0];
        }
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i]);
        return res;
    }
}


