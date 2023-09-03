import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        Task1();
        System.out.println();

        System.out.println("Task2");
        Task2();
        System.out.println();

        System.out.println("Task3");
        Task3();
        System.out.println();

        System.out.println("Task4");
        Task4();
        System.out.println();

        System.out.println("Task5");
        Task5();
        System.out.println();
    }


    public static void Task1() {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }


    public static void Task2() {

        System.out.println("Введите температуру");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (-5 >= t && t > -20) {
            System.out.println("Normal");
        } else if (-20 >= t) {
            System.out.println("Cold");
        }
    }


    public static void Task3() {
        int i;
        for (i = 10; i <= 20; i++) {
            System.out.print(i*i+" ");

        }
        System.out.println();

    }

    public static void Task4() {
        int i = 1;
        while (i<=14){

            System.out.print(i*7+" ");
            i++;
        }
        System.out.println();

    }

    public static void Task5() {

        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double t = scanner.nextDouble();
            int sum=0;
            if (t%1==0 && t>=0) {
                for(int i=1;i<=t;i++) {
                    sum+=i;
                    System.out.print(i+" ");

                }
                System.out.println();

                System.out.println("Сумма " +sum);

            } else {
                System.out.println("Некорретное число");
                continue;
            }
        }
    }
}