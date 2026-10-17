
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = new int[1000];
        Random random = new Random();

        // Generate random input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4);
        }

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

        System.out.println("******** Insertion Sort Completed! ********");
        System.out.println("Total Elements: " + arr.length);
        System.out.println("Execution time in NanoSeconds: " + executionTime);
        System.out.println("Execution time in MilliSeconds: "
                + executionTime / 1_000_000.0);

        System.out.println("******** Sorted Array ********");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 30 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
