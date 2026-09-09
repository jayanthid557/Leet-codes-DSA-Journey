class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletion {
    static void deleteLastNode(Node head) {
        if (head == null || head.next == null) {
            return; 
        }
        
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        
        current.next = null; 
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        Node head = null;
        Node tail = null;

        for (int x : arr) {
            Node newNode = new Node(x);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        deleteLastNode(head);
        printList(head); 
    }
}
