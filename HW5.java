import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HW5 {
    public static void main(String[] args) {

        double[][] matrix;
        matrix = new double[5][5];

        System.out.println("Task1_1");
        Task1_1(matrix);

        System.out.println("Task1_2");
        Task1_2(matrix);

        System.out.println("Task1_3");
        Task1_3(matrix);

        System.out.println("Task2");
        Task2();

    }

    public static void Task1_1(double[][] matrix) {
        Creation(matrix);
        System.out.println();
    }


    public static void Task1_2(double[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        Creation(matrix);
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += a;
                Convertation(matrix, i, j);

            }
            System.out.println();

        }
        System.out.println();
    }

    public static void Task1_3(double[][] matrix) {
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            Creation(matrix);
            System.out.println();
            int b=0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    b += matrix[i][j];
                    Convertation(matrix, i, j);

                }
                System.out.println();

            }
            System.out.println("Cумма "+ b);
        System.out.println();

    }


    public static void Task2() {
        String[][] doska;
        doska = new String[8][8];
        System.out.println();
        int b=0;
        for (int i = 0; i < doska.length; i++) {
            for (int j = 0; j < doska[i].length; j++) {
                if((i+j)%2==0){
                    doska[i][j]="W";
                }
                else{
                    doska[i][j]="B";
                }
                System.out.print(doska[i][j]+" ");

            }
            System.out.println();

        }

        System.out.println();

    }



    public static void Convertation(double matrix[][], int i, int j) {
        if (matrix[i][j] < (matrix[i][j] + 0.5)) {
            matrix[i][j] = matrix[i][j] - (matrix[i][j] % 1);
        } else {
            matrix[i][j] = matrix[i][j] - (matrix[i][j] % 1) + 1;

        }
        System.out.print((int) matrix[i][j] + " ");
    }

    public static double[][] Creation(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10 * Math.random();
                Convertation(matrix, i, j);
            }
            System.out.println();

        }
        return matrix;
    }


}
