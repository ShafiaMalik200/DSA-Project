class Stack2DArray {

    int[][] stack = new int[3][3];
    int top = -1;

    // Push operation
    void push(int data) {

        if (top == 8) {
            System.out.println("Stack is Full");
            return;
        }

        top++;

        int row = top / 3;
        int column = top % 3;

        stack[row][column] = data;

        System.out.println(data + " pushed into stack");
    }

    // Pop operation
    void pop() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        int row = top / 3;
        int column = top % 3;

        System.out.println("Deleted: " + stack[row][column]);

        top--;
    }

    // Display operation
    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack:");

        for (int i = top; i >= 0; i--) {

            int row = i / 3;
            int column = i % 3;

            System.out.print(stack[row][column] + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Stack2DArray stack = new Stack2DArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        stack.pop();

        System.out.println("After Pop:");
        stack.display();
    }
}
