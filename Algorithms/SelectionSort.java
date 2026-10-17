
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();

        // Generate 1000 random numbers from 1 to 1000
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000) + 1;
        }

        long startTime = System.nanoTime();

        // Selection Sort Algorithm
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

        System.out.println("******** Selection Sort Completed! ********");
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
