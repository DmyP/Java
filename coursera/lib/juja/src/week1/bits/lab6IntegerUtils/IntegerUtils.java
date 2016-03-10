package week1.bits.lab6IntegerUtils;
/*
Реализовать метод rightShift(int) класса IntegerUtils, который осуществляет ЦИКЛИЧЕСКИЙ СДВИГ (биты, которые
“выталкивают” с одного конца – появляются на втором конце) битов вправо. То есть rightShift(int) получив число
0b00000000_00000000_00000000_00000001 возвращает 0b10000000_00000000_00000000_00000000 получив число
0b10000000_00000000_00000000_00000000 возвращает 0b01000000_00000000_00000000_00000000 получив число
0b00111000_11111111_00000000_10101010 возвращает 0b00011100_01111111_10000000_01010101
*/
public class IntegerUtils {
    public static void main(String[] args) {
        int x = 0b10000000_00000000_00000000_00000000, y = 0;
        y = rightShift(x);
    }

    public static int rightShift(int arg) {
        System.out.println("До сдвига:\t\t\t" + arg + " " + Integer.toBinaryString(arg));
        int temp = arg;
        System.out.println("темп до:\t\t\t" + temp + " " + Integer.toBinaryString(temp));
        temp = temp << 31;
        System.out.println("темп после:\t\t\t" + temp + " \t" + Integer.toBinaryString(temp));
        arg >>>= 1;
        System.out.println("После сдвига влево:\t" + arg + " "+ Integer.toBinaryString(arg));
        arg = arg + temp;
        System.out.println("После сдвига вправо:" + arg + " "+ Integer.toBinaryString(arg));
        return arg;
    }

}

