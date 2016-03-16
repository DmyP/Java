package week5.lab36PolyUtils2;

/*
    Предположим, что мы работаем с полиномами и храним их в виде последовательности коэффициентов.
    То есть полином f = 1 * x*x*x + 2*x*x + 3*x + 4 представляем в виде [1, 2, 3, 4] точнее

    new BigInteger[] {new BigInteger("1"),new BigInteger("2"),new BigInteger("3"),new BigInteger("4")}
    Полином f = 10 * x*x - 100 представляем в виде [10, 0, -100] точнее

    new BigInteger[] {new BigInteger("10"),new BigInteger("0"),new BigInteger("-100"),}
    Реализовать произведение полиномов, то есть нам дают полиномы
    f1 = x + 1 в виде [1, 1] и f2 = x + 1 в виде [1, 1] то мы должны вычислить
    (x + 1) * (x + 1) = x*x + 2*x + 1 в виде [1, 2, 1]
    Есть нам дают полиномы
    f1 = 10*x*x + 1 в виде [10, 0, 1] и f2 = -x в виде [-1, 0] то мы должны вычислить
    (10*x*x + 1) * (-x) = -10*x*x*x -x в виде [-10, 0, -1, 0]
 */

import java.math.BigInteger;

public class PolyUtils {
    public static void main(String[] args) {
        //BigInteger[] x1 = {new BigInteger("1"), new BigInteger("1")};
        //BigInteger[] x2 = {new BigInteger("1"), new BigInteger("1")};

        BigInteger[] x1 = {new BigInteger("10"), new BigInteger("0"), new BigInteger("1")};
        BigInteger[] x2 = {                      new BigInteger("-1"), new BigInteger("0")};

        BigInteger[] result = mul(x1, x2);
        System.out.println(result);
    }

    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
        BigInteger[] res = new BigInteger[x.length + y.length - 1];
        BigInteger temp = new BigInteger("0");
        BigInteger temp2 = new BigInteger("0");
        BigInteger length = BigInteger.valueOf(y.length);

        if (x == null) return null;

        for (int i = y.length - 1; i >= 0; i--) {
            for (int j = x.length - 1; j >= 0; j--) {
                temp = x[j].multiply(y[i]);
                if (res[i + j] == null)
                    res[i + j] = temp;
                else
                    res[i + j] = res[i + j].add(temp);
            }
        }
        return res;
    }
}
