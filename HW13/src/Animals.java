import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Animals {
    static Scanner scanner = new Scanner(System.in);
   static LinkedList<String> animals = new LinkedList<>();

    public Animals() {
    }
    public static void add(){
        System.out.println("Введите название: ");
        String animal = scanner.nextLine();
        animals.addFirst(animal);
    }
    public static void delete() {
        if (!animals.isEmpty()) {
            animals.removeLast();
        }
    }
}
