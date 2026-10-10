class StackLinkedList {

    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Push
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Deleted: " + top.data);
            top = top.next;
        }
    }

    // Display
    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack:");
        stack.display();

        stack.pop();

        System.out.println("After Pop:");
        stack.display();
    }
}
