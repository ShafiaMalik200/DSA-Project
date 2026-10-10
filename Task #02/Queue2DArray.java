class Queue2DArray {

    int[][] queue = new int[3][3];

    int front = 0;
    int rear = -1;

    // Enqueue operation
    void enqueue(int data) {

        if (rear == 8) {
            System.out.println("Queue is Full");
            return;
        }

        rear++;

        int row = rear / 3;
        int column = rear % 3;

        queue[row][column] = data;

        System.out.println(data + " added to queue");
    }

    // Dequeue operation
    void dequeue() {

        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        int row = front / 3;
        int column = front % 3;

        System.out.println("Deleted: " + queue[row][column]);

        front++;
    }

    // Display operation
    void display() {

        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue:");

        for (int i = front; i <= rear; i++) {

            int row = i / 3;
            int column = i % 3;

            System.out.print(queue[row][column] + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Queue2DArray queue = new Queue2DArray();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.dequeue();

        System.out.println("After Dequeue:");
        queue.display();
    }
}

