public class sol1 {
    public static String reverseString(String s) {
        if (s == null || s.length() == 0) return "";
        char[] chars = s.toCharArray();
        char[] resChars = new char[chars.length];
        int j = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            resChars[j] = chars[i];
            j++;
        }
        String result = String.valueOf(resChars);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("adcdef"));
    }
}
