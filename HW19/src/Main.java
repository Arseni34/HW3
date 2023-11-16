import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Task 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int size = scanner.nextInt();
        System.out.println("Введите массив: ");
        int [] array = new int[size];
        for(int i = 0; i<size; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

        MaxElement maxElement = new MaxElement(array);
        Thread maxThread  = new Thread(maxElement);
        maxThread.start();
        maxThread.join();
        System.out.println("Максимальный элемент " + maxElement.getMax());

        MinElement minElement = new MinElement(array);
        Thread minThread = new Thread(minElement);
        minThread.start();
        minThread.join();
        System.out.println("Минимальный элемент " + minElement.getMin());

            System.out.println("Task 2");
            BubbleSort bubbleSort = new BubbleSort(array);
            Thread bubble = new Thread(bubbleSort);
            bubble.start();
            InsertionSort insertionSort = new InsertionSort(array);
            Thread insertion = new Thread(insertionSort);
            insertion.start();
            SelectionSort selectionSort = new SelectionSort(array);
            Thread selection = new Thread(selectionSort);
            selection.start();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}