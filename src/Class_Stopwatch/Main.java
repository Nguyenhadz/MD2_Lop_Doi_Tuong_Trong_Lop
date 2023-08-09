package Class_Stopwatch;

public class Main {
    public static void selectionSort(long[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    long item = arr[i];
                    arr[i] = arr[j];
                    arr[j] = item;
                }
            }
        }
        System.out.println("\nArray after sorting:");
        for (long value : arr) {
            System.out.println(value);
        }
    }
        public static void main(String[] args) {
            long[] array = new long[100000];
            for (int i=0;i<array.length; i++) {
                array[i] = Math.round(Math.random()*1000);
            }
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.start();
            selectionSort(array);
            stopwatch.end();
            System.out.println("Time: " + stopwatch.getElapsedTime());

        }
}
