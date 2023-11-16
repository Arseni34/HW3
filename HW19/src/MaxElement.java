public class MaxElement implements Runnable{
    private int[] array;

    public MaxElement(int[] array) {
        this.array = array;
    }
    int max ;

    @Override
    public void run() {
        max  = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
    }

    public int getMax() {
        return max;
    }
}
