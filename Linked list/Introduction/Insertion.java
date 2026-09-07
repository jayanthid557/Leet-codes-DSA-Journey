public class Insertion {

    static Node insertAtHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
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

        head = insertAtHead(head, 5);

        printList(head);
    }
}