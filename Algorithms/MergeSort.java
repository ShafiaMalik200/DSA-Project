
import java.util.Random;

public class MergeSort {

    // Merge two sorted parts
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    // Divide and sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[1000];
        Random random = new Random();

        // Generate random input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4);
        }

        long startTime = System.nanoTime();

        // Merge Sort
        mergeSort(arr, 0, arr.length - 1);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("******** Merge Sort Completed! ********");
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
