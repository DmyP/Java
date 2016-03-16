package week5.lab34toBitStr;
/*
    Реализовать метод, который преобразует BigInteger в битовую строку (String из '0' и '1')
    toBitStr(new BigInteger("2")) = "10"
    toBitStr(new BigInteger("8")) = "1000"
    toBitStr(new BigInteger("10")) = "1010"
    toBitStr(new BigInteger("140")) = "10001100"
 */

import java.math.BigInteger;


public class BigIntegerUtils {

    public static void main(String[] args) {
        BigInteger x = BigInteger.valueOf(140);
        String s = toBitStr(x);
        System.out.println(s);
    }


    public static String toBitStr(BigInteger arg) {

        BigInteger bin = new BigInteger("0");
        BigInteger po10 = new BigInteger("1");
        BigInteger dig = new BigInteger("0");
        BigInteger zero = new BigInteger("0");
        BigInteger two = new BigInteger("2");
        BigInteger ten = new BigInteger("10");
        while (arg.compareTo(zero) > 0) {
            dig = arg.remainder(two);
            bin = bin.add(dig.multiply(po10));
            arg = arg.divide(two);
            po10 = po10.multiply(ten);
        }
        return bin.toString();

    }
}
