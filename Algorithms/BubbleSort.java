import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        System.out.println("Original Array (first 20): "
                + Arrays.toString(Arrays.copyOf(arr, 20)));

        long startTime = System.nanoTime();

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
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
