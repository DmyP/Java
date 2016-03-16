package week5.lab35Polynom;
/*
    Предположим, что мы работаем с полиномами и храним их в виде последовательности коэффициентов.

    То есть полином f = 1 * x*x*x + 2*x*x + 3*x + 4 представляем в виде [1, 2, 3, 4] точнее
    new BigInteger[] { new BigInteger("1"), new BigInteger("2"), new BigInteger("3"), new BigInteger("4"),}

    Полином f = 10 * x*x - 100 представляем в виде [10, 0, -100] точнее
    new BigInteger[] {new BigInteger("10"), new BigInteger("0"), new BigInteger("-100"),}
    Реализовать вычисление полинома в точке, то есть нам, скажем, дают полином f = 2*x*x*x - 3*x
    в виде [2, 0, -3, 0] и точку 100, а мы должны вычислить 2*100*100*100 - 3*100 = 2000000 - 300 = 1999700
 */

import java.math.BigInteger;

public class PolyUtils {

    public static void main(String[] args) {
        BigInteger[] x1 = {new BigInteger("1"), new BigInteger("2"), new BigInteger("3"), new BigInteger("4")};
        BigInteger[] x2 = {new BigInteger("10"), new BigInteger("0"), new BigInteger("-100")};
        BigInteger[] x3 = {new BigInteger("2"), new BigInteger("0"), new BigInteger("-3"), new BigInteger("0")};
        BigInteger point = BigInteger.valueOf(100);

        BigInteger result1 = eval(x1, point);
        BigInteger result2 = eval(x2, point);
        BigInteger result3 = eval(x3, point);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }


    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        BigInteger res = new BigInteger("0");
        BigInteger temp = new BigInteger("0");
        BigInteger length = BigInteger.valueOf(poly.length);
        if (poly == null) return null;
        for (int i = 0; i < poly.length; i++) {
            temp = poly[i];
            for (int j = 0; j < poly.length - i -1; j++) {
                temp = temp.multiply(arg);
            }
            res = res.add(temp);
        }
        return res;
    }

}
