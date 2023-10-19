import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1");
        System.out.println("Введите дату рождения в формате гг-мм-дд: ");
        String dateOfBirth = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateOfBirth);
        LocalDate date100years = date.plusYears(100);
        System.out.println("Вам исполнится 100 лет "+ date100years);

        System.out.println("Task 2");
        ArrayList<Integer> Array = new ArrayList<>();
        System.out.println("Введите количество чисел в массиве: ");
        int q = scanner.nextInt();
        System.out.println("Введите массив: ");
        for (int i = 0; i < q; i++) {
            Array.add(scanner.nextInt());
        }
        scanner.nextLine();
        System.out.println(Array);
        Predicate<Integer> isTrue = a -> a >= 0;
        Array = (ArrayList<Integer>) Array.stream().filter(isTrue).collect(Collectors.toList());
        System.out.println("Остаются только положительные: ");
        System.out.println(Array);

        System.out.println("Task 3");
        Function<String, Double> parse = x -> {
            String[] BYN = x.split(" ");
            return Double.parseDouble(BYN[0]) / 3.29;
        };
        System.out.println("Введите сумму в BYN: ");
        String money = scanner.nextLine();
        System.out.println("Курс USD на 19.10.2023: 3.29 BYN");
        System.out.println(money + " = " + String.format("%.2f", parse.apply(money)) + " USD");

        System.out.println("Task 4");
        Consumer<String> output = x -> {
            String[] Byn = x.split(" ");
            double usd = Double.parseDouble(Byn[0]) / 3.29;
            System.out.println(x + " = " + String.format("%.2f", usd) + " USD");
        };
        System.out.println("Введите сумму в BYN: ");
        String money2 = scanner.nextLine();
        System.out.println("Курс USD на 19.10.2023: 3.29 BYN");
        output.accept(money2) ;

        System.out.println("Task 5");
        System.out.println("Введите строку: ");
        Supplier<String> supplier = () -> {
            String userInput = scanner.nextLine();
           StringBuilder sb = new StringBuilder(userInput);
            return sb.reverse().toString();
        };
        String reverse = supplier.get();
        System.out.println("Строка задом наперед: "+ reverse);
    }
}
