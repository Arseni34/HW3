import java.util.Arrays;

public class InsertionSort implements Runnable{
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }
    @Override
    public void run(){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
        System.out.println("Сортировка вставками по убыванию: "+Arrays.toString(array));

    }
}
