package week1.yummy.lab11MathUtils;
/*
Реализовать функцию, которая по целочисленому аргументу c возвращает количество целочисленных решений неравенства
a*a + b*b <= c a > 0 b > 0
Например
lookFor(14) == 8
поскольку для решения подходят следующие пары значений
(a=1,b=1), (a=1,b=2), (a=1,b=3), (a=2,b=1), (a=2,b=2), (a=2,b=3), (a=3,b=1), (a=3,b=2)
 */
public class MathUtils {
    public static void main(String[] args) {
        System.out.println(lookFor(14));
    }

    public static int lookFor(int max) {
        int count = 0;
        String str = "";
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j < max; j++) {
                if (((i * i) + (j * j)) <= max){
                    count++;
                    str = str + (count + " (a= " + i + ", b= " + j + ")\n");
                }
            }
        }
        System.out.println(str);
        return count;
    }

}
