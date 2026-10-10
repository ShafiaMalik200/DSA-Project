import java.util.Scanner;

public class Stack {

    static final int MAX_SIZE = 10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] stack = new int[MAX_SIZE];
        int top = -1;

        int choice;

        do {

            System.out.println("\n========== STACK MENU ==========");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            // 1. Push
            if (choice == 1) {

                if (top == MAX_SIZE - 1) {
                    System.out.println("Stack is full! Overflow.");
                } else {

                    System.out.print("Enter value: ");
                    int value = input.nextInt();

                    top++;
                    stack[top] = value;
                    System.out.println("Value pushed successfully.");
                }
            }

            // 2. Pop
            else if (choice == 2) {

                if (top == -1) {
                    System.out.println("Stack is empty! Underflow.");
                } else {

                    System.out.println(
                            "Popped value = " + stack[top]
                    );

                    top--;

                    System.out.println("Value popped successfully.");
                }
            }

            // 3. Display
            else if (choice == 3) {

                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {

                    System.out.print(
                            "Stack elements (top to bottom): "
                    );

                    for (int i = top; i >= 0; i--) {
                        System.out.print(stack[i] + " ");
                    }

                    System.out.println();
                }
            }

            // 4. Size
            else if (choice == 4) {

                System.out.println(
                        "Current stack size = " + (top + 1)
                );
            }

            // 5. isEmpty
            else if (choice == 5) {

                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Stack is not empty.");
                }
            }

            // 6. isFull
            else if (choice == 6) {

                if (top == MAX_SIZE - 1) {
                    System.out.println("Stack is full.");
                } else {
                    System.out.println("Stack is not full.");
                }
            }

            // 7. Exit
            else if (choice == 7) {

                System.out.println("Exiting Stack Program...");
            }

            else {
                System.out.println("Invalid choice! Please select 1-7.");
            }

        } while (choice != 7);

        input.close();
    }
}