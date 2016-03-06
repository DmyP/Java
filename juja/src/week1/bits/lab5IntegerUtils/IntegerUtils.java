package week1.bits.lab5IntegerUtils;
/* Реализовать метод leftShift(int) класса IntegerUtils, который осуществляет ЦИКЛИЧЕСКИЙ СДВИГ (биты,
которые “выталкивают” с одного конца – появляются на втором конце) битов влево. То есть leftShift(int)
получив число 0b00000000_00000000_00000000_00000001 возвращает 0b00000000_00000000_00000000_00000010
получив число 0b10000000_00000000_00000000_00000000 возвращает 0b00000000_00000000_00000000_00000001
получив число 0b00111000_11111111_00000000_10101010 возвращает 0b01110001_11111110_00000001_01010100
*/
public class IntegerUtils {
    public static void main(String[] args) {
        int x =2147483647, y = 0;
        //int x =1073741824, y = 0;
        y = leftShift(x);
        //System.out.println(y);
    }
    public static int leftShift(int arg) {
        System.out.println("До сдвига:" + arg + " " + Integer.toBinaryString(arg));
        //int temp = arg;
        int temp = 0b10000000_00000000_00000000_00000000;
        System.out.println("темп:" + temp + " " + Integer.toBinaryString(temp));
        temp = temp >>> 31;
        System.out.println("темп:" + temp + " " + Integer.toBinaryString(temp));
        arg <<= 1;
        System.out.println("После сдвига влево:" + arg + " "+ Integer.toBinaryString(arg));

        //arg >>= 1;
        arg = arg + temp;
        System.out.println("После сдвига вправо:" + arg + " "+ Integer.toBinaryString(arg));

/*
 public static int leftShift(int arg) {
       int temp = arg;
       temp = temp >>> 31;
       arg <<= 1;
       arg = arg + temp;
       return arg;
    }
 */
        return arg;
    }





}
