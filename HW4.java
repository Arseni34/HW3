import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HW4 {
    public static void main(String[] args) {

        System.out.println("Task 1");
        Task1();
        System.out.println("Task 2");
        Task2();
        System.out.println("Task 3");
        Task3();
        System.out.println("Task 4");
        Task4();
        System.out.println("Task 5");
        Task5();
        System.out.println("Task 6");
        Task6();

    }

    public static void Task1() {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] massiv = new double[size];
        for (int i = 0; i <= (size - 1); i++) {
            massiv[i] = 10 * Math.random();
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
            System.out.print((int) massiv[i] + " ");
        }
        System.out.println();
        for (int i = (size - 1); i >= 0; i--) {
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
            System.out.print((int) massiv[i] + " ");
        }
        System.out.println();


    }

    public static void Task2() {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] massiv = new double[size];
        System.out.println("Введите числа");

        for (int i = 0; i <= (size - 1); i++) {
            massiv[i] = scanner.nextDouble();
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
        }
        System.out.println();
        for (int i = 0; i <= (size - 1); i++) {
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
            System.out.print((int) massiv[i] + " ");
        }
        System.out.println();
        double a = massiv[0];
        double b= massiv[0];
        for (int i = 0; i <= (size - 1); i++) {
            if (a<massiv[i]) {
               a=massiv[i];
            }
            if (b>massiv[i]) {
                b=massiv[i];
            }
        }
        System.out.print(a+" "+ b);

        System.out.println();

    }

    public static void Task3() {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] massiv = new double[size];
        System.out.println("Введите числа");

        for (int i = 0; i <= (size - 1); i++) {
            massiv[i] = scanner.nextDouble();
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
        }
        System.out.println();
        for (int i = 0; i <= (size - 1); i++) {
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
            System.out.print((int) massiv[i] + " ");
        }
        System.out.println();
        double a = massiv[0];
        double b= massiv[0];
        int c=0;
        int d=0;
        for (int i = 0; i < size; i++) {
            if (a<massiv[i]) {
                a=massiv[i];
                c=i;
            }

            if (b>massiv[i]) {
                b=massiv[i];

                d=i;
            }
        }
        System.out.print("Наибольшее индекс "+ c+ " "+"Наименьшее индекс "+ d+1);

        System.out.println();

    }
    public static void Task4() {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] massiv = new double[size];
        System.out.println("Введите числа");

        for (int i = 0; i <= (size - 1); i++) {
            massiv[i] = scanner.nextDouble();
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
        }
        System.out.println();
        for (int i = 0; i <= (size - 1); i++) {
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
            System.out.print((int) massiv[i] + " ");
        }
        System.out.println();
        int a=0;
        for (int i = 0; i < size; i++) {
            if (massiv[i]==0) {
                a++;
            }
        }
        if(a!=0) {
            System.out.print("Количество нулей " + a);
        }
        else {
            System.out.print("Нулей нет" );

        }
        System.out.println();

    }
    public static void Task5() {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] massiv = new double[size];
        System.out.println("Введите числа");

        for (int i = 0; i <= (size - 1); i++) {
            massiv[i] = scanner.nextDouble();
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
        }
        System.out.println();
        for (int i = 0; i <= (size - 1); i++) {
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
            System.out.print((int) massiv[i] + " ");
        }
        System.out.println();
        double a ;
        for (int i = 0; i < (size/2); i++) {
            a= massiv[i];
        massiv[i]=massiv[(size-1)-i];
            massiv[(size-1)-i]=a;
        }

        for (int i = 0; i <= (size - 1); i++) {
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
            System.out.print((int) massiv[i] + " ");
        }
        System.out.println();

    }
    public static void Task6() {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] massiv = new double[size];
        System.out.println("Введите числа");

        for (int i = 0; i <= (size - 1); i++) {
            massiv[i] = scanner.nextDouble();
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
        }
        System.out.println();
        for (int i = 0; i <= (size - 1); i++) {
            if (massiv[i] < (massiv[i] + 0.5)) {
                massiv[i] = massiv[i] - (massiv[i] % 1);
            } else {
                massiv[i] = massiv[i] - (massiv[i] % 1) + 1;

            }
            System.out.print((int) massiv[i] + " ");
        }
        System.out.println();
        int a=0;
        for (int i = 0; i < (size-1); i++) {
            if (massiv[i]>=massiv[i+1]) {
               a++;
            }
        }
        if(a==0) {
            System.out.println("Возрастает");
        }
        else{
            System.out.println("Не возрастает");

        }
    }

}