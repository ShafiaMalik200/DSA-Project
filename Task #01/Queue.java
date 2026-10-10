import java.util.Scanner;

public class Queue {

    static final int MAX_SIZE = 10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] queue = new int[MAX_SIZE];

        int front = 0;
        int rear = -1;
        int size = 0;

        int choice;

        do {

            System.out.println("\n========== QUEUE MENU ==========");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            // 1. Enqueue
            if (choice == 1) {

                if (size == MAX_SIZE) {

                    System.out.println("Queue is full! Overflow.");

                } else {

                    System.out.print("Enter value: ");
                    int value = input.nextInt();

                    // Move rear circularly
                    rear = (rear + 1) % MAX_SIZE;

                    queue[rear] = value;
                    size++;

                    System.out.println(
                            "Value enqueued successfully."
                    );
                }
            }

            // 2. Dequeue
            else if (choice == 2) {

                if (size == 0) {

                    System.out.println(
                            "Queue is empty! Underflow."
                    );

                } else {

                    System.out.println(
                            "Dequeued value = " + queue[front]
                    );

                    // Move front circularly
                    front = (front + 1) % MAX_SIZE;

                    size--;

                    System.out.println(
                            "Value dequeued successfully."
                    );
                }
            }

            // 3. Display
            else if (choice == 3) {

                if (size == 0) {

                    System.out.println("Queue is empty.");

                } else {

                    System.out.print(
                            "Queue elements (front to rear): "
                    );

                    for (int i = 0; i < size; i++) {

                        int index = (front + i) % MAX_SIZE;

                        System.out.print(queue[index] + " ");
                    }

                    System.out.println();
                }
            }

            // 4. Size
            else if (choice == 4) {

                System.out.println(
                        "Current queue size = " + size
                );
            }

            // 5. isEmpty
            else if (choice == 5) {

                if (size == 0) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println("Queue is not empty.");
                }
            }

            // 6. isFull
            else if (choice == 6) {

                if (size == MAX_SIZE) {
                    System.out.println("Queue is full.");
                } else {
                    System.out.println("Queue is not full.");
                }
            }

            // 7. Exit
            else if (choice == 7) {

                System.out.println("Exiting Queue Program...");
            }

            else {
                System.out.println("Invalid choice! Please select 1-7.");
            }

        } while (choice != 7);

        input.close();
    }
}
