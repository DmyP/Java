import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source = scanner.nextLine(), result = "";
        for (String part : source.split(" "))
            result += new StringBuilder(part).reverse().toString().replaceAll("[^a-zA-Z]", "") + " ";
        for (int i = 0; i < source.length(); i++)
            if (isSymbol(source.charAt(i)))
                result = String.valueOf(new StringBuilder(result).insert(i, source.charAt(i)));
        System.out.println(result);
        scanner.close();
    }

    public static boolean isSymbol(Character character) {
        Pattern p = Pattern.compile("[^a-zA-Z ]");
        Matcher m = p.matcher(character.toString());
        return m.matches();
    }
}
