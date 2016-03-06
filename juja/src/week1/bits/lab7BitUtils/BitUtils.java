package week1.bits.lab7BitUtils;
/*
Реализуйте метод swapBits(b, i, j), который производит "рокировку" битов с номерами i и j,
то есть swapBits(0b1111_0000, 0, 6) = 0b1011_0001 swapBits(0b0000_1000, 3, 1) = 0b0000_0010
*/
public class BitUtils {
    public static void main(String[] args) {
        byte b = 123;
        int i = 2, j = 4;
        b = swapBits(b, i, j);
        System.out.println(b);
    }
    public static byte swapBits(byte b, int i, int j) {
        if (j>i) {
            int x = j;
            j = i;
            i = x;
        }
        byte part1 = (byte)(((b >>> i) << 31) >>> (31-j));
        byte part2 = (byte)(((b >>> j) << 31) >>> (31-i));
        byte part3 = (byte)(((b << 24) >>> (25+i)) << (i+1));
        byte part4 = 0b0000_0000;
        if ((i-j)!=1) part4 = (byte)(((b >>> (j + 1)) << (33 - i + j)) >>> (32-i));
        byte part5 = 0b0000_0000;
        if (j !=0) {
            part5 = (byte)((b << (32-j)) >>> (32-j));
        }
        byte z = (byte)(part1 | part2);
        z = (byte)(z | part3);
        z = (byte)(z | part4);
        z = (byte)(z | part5);
        return z;
    }
}
