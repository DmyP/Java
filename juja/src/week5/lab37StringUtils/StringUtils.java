package week5.lab37StringUtils;

/*
Реализовать функцию, которая делает циклический сдвиг букв вправо, то есть
StringUtils("ABCDE", 1) = "EABCD"  StringUtils("ABCDE", 2) = "DEABC"
StringUtils("ABCDE", 3) = "CDEAB"  StringUtils("ABCDE", 4) = "BCDEA"
Допустимо сдвигать на расстояние больше длины строки
StringUtils("ABCDE", 5) = "ABCDE"  StringUtils("ABCDE", 6) = "EABCD"  StringUtils("ABCDE", 7) = "DEABC"
Допустимо сдвигать на отрицательное расстояние (выходит сдвиг влево)
StringUtils("ABCDE", -1) = "BCDEA"  StringUtils("ABCDE", -2) = "CDEAB" StringUtils("ABCDE", -7) = "CDEAB".
Сдвиг на расстояние 0 и сдвиги строк длиной 0 и 1 символ - разрешены.
 */

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(rightShift("ABCDE", -2000000001));
    }

    public static String rightShift(String arg, int delta) {
        if (arg == null | arg == "") return "";
        delta = delta%arg.length();

        if (delta > 0) {
            for (int i = 0; i < delta; i++) {
                arg = arg.charAt(arg.length() - 1) + arg.substring(0, arg.length() - 1);
            }
        } else {
            for (int i = delta; i < 0; i++) {

                arg =  arg.substring(1, arg.length()) + arg.charAt(0);
            }
        }
        return arg;

    }
}




