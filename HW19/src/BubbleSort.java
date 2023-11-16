import java.util.Arrays;

public class BubbleSort implements Runnable{
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }
    @Override
    public void run(){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Сортировка пузырьком по возрастанию: "+Arrays.toString(array));
    }
}
