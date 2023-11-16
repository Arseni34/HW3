 public class MinElement implements Runnable {
     private int[] array;

     public MinElement(int[] array) {
         this.array = array;
     }
     int min ;

     @Override
     public void run() {
         min = array[0];
         for (int i = 1; i < array.length; i++) {
             if (array[i] < min) {
                 min = array[i];
             }
         }
     }

     public int getMin() {
         return min;
     }

 }