import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        System.out.println("Original Array (first 20): "
                + Arrays.toString(Arrays.copyOf(arr, 20)));

        long startTime = System.nanoTime();

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Sorted Array (first 20): "
                + Arrays.toString(Arrays.copyOf(arr, 20)));
        System.out.println("Total elements: " + arr.length);
        System.out.println("Execution Time: " + executionTime + " nanoseconds");
        System.out.println("Execution Time: " + executionTime / 1_000_000.0
                + " milliseconds");
    }
}
