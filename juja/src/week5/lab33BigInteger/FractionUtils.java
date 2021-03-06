package week5.lab33BigInteger;
/*
    Предположим, что мы работаем с дробями, представляя их как пару BigInteger-ов.
    2/3 будем представлять как BigInteger[] x = {new BigInteger("2"), new BigInteger("3")};
    Реализовать метод, который обеспечивает - сложение дробей 1/3 + 1/3 = 2/3 1/2 + 1/3 = 5/6
    - итоговая дробь должна быть несократимой
    1/2 + 1/2 = 1/1 (а не 2/2)
    2/3 - 1/6 = 1/2 (а не 3/6)
    1/2 + (-1)/2 = 0/1 (а не 0/2) --- P.S. Возможно, вам потребуется метод
    BigInteger.gcd().
*/

import java.math.BigInteger;

public class FractionUtils {
    public static void main(String[] args) {
        BigInteger[] x = {BigInteger.valueOf(1), BigInteger.valueOf(2)};
        BigInteger[] y = {BigInteger.valueOf(1), BigInteger.valueOf(2)};

        BigInteger[] res = sum(x, y);
    }


    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {
        BigInteger[] result = {(x[0].multiply(y[1])).add(y[0].multiply(x[1])), x[1].multiply(y[1])};

        BigInteger gcd = result[0].gcd(result[1]);
        if (gcd.intValue() > 1) {
            result[0] = result[0].divide(gcd);
            result[1] = result[1].divide(gcd);
            return result;
        } else if (gcd.intValue() == 1) {
            return result;
        }
        return null;
    }

}


