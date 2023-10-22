import java.util.ArrayList;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(9);
        intList.add(2);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(8);
        intList.add(9);
        intList.add(10);
        System.out.println("Изначальные числа: "+ intList);
        intList = (ArrayList<Integer>) intList.stream()
                .filter(integer -> (integer%2==0))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Оставшиеся числа: " + intList);

        int sum = intList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма оставшихся: "+ sum);
    }
}