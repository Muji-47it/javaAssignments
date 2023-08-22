class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void displayNode() {
        System.out.print(data + " ");
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertSquare(int value) {
        int square = value * value;
        Node newNode = new Node(square);
        newNode.next = head;
        head = newNode;
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.insertSquare(2);
        myList.insertSquare(4);
        myList.insertSquare(6);
        myList.insertSquare(8);

        System.out.print("Squares in the linked list: ");
        myList.displayList();
    }
}
