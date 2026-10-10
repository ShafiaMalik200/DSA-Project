class CircularQueue {

    int[] queue = new int[5];

    int front = -1;
    int rear = -1;

    // Enqueue operation
    void enqueue(int data) {

        // Check if queue is full
        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue is Full");
            return;
        }

        // First element
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % queue.length;
        }

        queue[rear] = data;

        System.out.println(data + " added to queue");
    }

    // Dequeue operation
    void dequeue() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + queue[front]);

        // Only one element was present
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    // Display operation
    void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue:");

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        System.out.println("After Dequeue:");
        queue.display();

        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println("After Adding 60 and 70:");
        queue.display();
    }
}

