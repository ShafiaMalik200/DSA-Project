
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[1000];
        Random random = new Random();

        // Generate 1000 random elements: 0, 1, 2, 3
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4);
        }

        // Start execution time
        long startTime = System.nanoTime();

        // Bubble Sort Algorithm
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

        // End execution time
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        // Display output
        System.out.println("******** Bubble Sort Completed! ********");
        System.out.println("Total Elements: " + arr.length);
        System.out.println("Execution time in NanoSeconds: "
                + executionTime);
        System.out.println("Execution time in MilliSeconds: "
                + executionTime / 1_000_000.0);

        System.out.println("******** Sorted Array ********");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            // Print 30 numbers per line
            if ((i + 1) % 30 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
