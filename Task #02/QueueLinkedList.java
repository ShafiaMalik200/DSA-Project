class QueueLinkedList {

    Node front;
    Node rear;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Enqueue
    void enqueue(int data) {

        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue
    void dequeue() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + front.data);

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Display
    void display() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue:");
        queue.display();

        queue.dequeue();

        System.out.println("After Dequeue:");
        queue.display();
    }
}