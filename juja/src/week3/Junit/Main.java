package week3.Junit;

public class Main {

    public static String changeXY(String input) {
        if (input.length() == 0) {
            return input;
        }

        String part = "";
        if (input.length() > 1) {
            part = changeXY(input.substring(1));
        }

        char ch = input.charAt(0);
        char newCh = (ch == 'x'?'y':ch);
        return newCh + part;
    }

    // make it work -> make it better -> make it fast

}
