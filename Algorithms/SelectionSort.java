import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        System.out.println("Original Array (first 20): "
                + Arrays.toString(Arrays.copyOf(arr, 20)));

        long startTime = System.nanoTime();

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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