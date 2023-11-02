import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s1 = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\b)[A-Z]{2,6}(\\b)");
        Matcher matcher = pattern.matcher(s1);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}