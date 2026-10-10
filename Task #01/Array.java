import java.util.Scanner;

public class Array {

    static final int MAX_SIZE = 10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[MAX_SIZE];
        int size = 0;
        int choice;

        do {
            System.out.println("\n========== ARRAY MENU ==========");
            System.out.println("1. Add a new value at the end");
            System.out.println("2. Insert a value at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete the last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display all elements");
            System.out.println("7. Search for a value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace/Update value at index");
            System.out.println("10. Size");
            System.out.println("11. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            // 1. Add at the end
            if (choice == 1) {

                if (size == MAX_SIZE) {
                    System.out.println("Array is full! Overflow.");
                } else {

                    System.out.print("Enter value: ");
                    int value = input.nextInt();

                    arr[size] = value;
                    size++;

                    System.out.println("Value added successfully.");
                }
            }

            // 2. Insert at index
            else if (choice == 2) {

                if (size == MAX_SIZE) {
                    System.out.println("Array is full! Cannot insert.");
                } else {

                    System.out.print("Enter index: ");
                    int index = input.nextInt();

                    if (index < 0 || index > size) {
                        System.out.println("Invalid index!");
                    } else {

                        System.out.print("Enter value: ");
                        int value = input.nextInt();

                        // Shift elements to the right
                        for (int i = size; i > index; i--) {
                            arr[i] = arr[i - 1];
                        }

                        arr[index] = value;
                        size++;

                        System.out.println("Value inserted successfully.");
                    }
                }
            }

            // 3. Fill array
            else if (choice == 3) {

                if (size == MAX_SIZE) {
                    System.out.println("Array is already full.");
                } else {

                    System.out.print("How many values do you want to enter? ");
                    int n = input.nextInt();

                    if (n < 0 || n > MAX_SIZE) {
                        System.out.println("Invalid number of values!");
                    } else {

                        size = n;

                        System.out.println("Enter " + n + " values:");

                        for (int i = 0; i < n; i++) {
                            arr[i] = input.nextInt();
                        }

                        System.out.println("Array filled successfully.");
                    }
                }
            }

            // 4. Delete last element
            else if (choice == 4) {

                if (size == 0) {
                    System.out.println("Array is empty! Underflow.");
                } else {

                    size--;

                    System.out.println("Last element deleted successfully.");
                }
            }

            // 5. Delete by index
            else if (choice == 5) {

                if (size == 0) {
                    System.out.println("Array is empty!");
                } else {

                    System.out.print("Enter index to delete: ");
                    int index = input.nextInt();

                    if (index < 0 || index >= size) {
                        System.out.println("Invalid index!");
                    } else {

                        // Shift elements to the left
                        for (int i = index; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }

                        size--;

                        System.out.println("Element deleted successfully.");
                    }
                }
            }

            // 6. Display
            else if (choice == 6) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.print("Array elements: ");

                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                }
            }

            // 7. Search
            else if (choice == 7) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.print("Enter value to search: ");
                    int value = input.nextInt();

                    boolean found = false;

                    for (int i = 0; i < size; i++) {

                        if (arr[i] == value) {
                            System.out.println(
                                    "Value found at index " + i
                            );
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Value not found.");
                    }
                }
            }

            // 8. Get value at index
            else if (choice == 8) {

                System.out.print("Enter index: ");
                int index = input.nextInt();

                if (index < 0 || index >= size) {
                    System.out.println("Invalid index!");
                } else {

                    System.out.println(
                            "Value at index " + index +
                            " = " + arr[index]
                    );
                }
            }

            // 9. Update value
            else if (choice == 9) {

                System.out.print("Enter index: ");
                int index = input.nextInt();

                if (index < 0 || index >= size) {
                    System.out.println("Invalid index!");
                } else {

                    System.out.print("Enter new value: ");
                    int value = input.nextInt();

                    arr[index] = value;

                    System.out.println("Value updated successfully.");
                }
            }

            // 10. Size
            else if (choice == 10) {

                System.out.println("Current array size = " + size);
            }

            // 11. Exit
            else if (choice == 11) {

                System.out.println("Exiting Array Program...");
            }

            else {
                System.out.println("Invalid choice! Please select 1-11.");
            }

        } while (choice != 11);

        input.close();
    }
}