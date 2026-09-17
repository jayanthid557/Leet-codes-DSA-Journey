
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        data = data1;
        next = next1;
        prev = prev1;
    }

    Node(int data1) {
        data = data1;
        next = null;
        prev = null;
    }
}

public class Introduction{
    public static Node convertArrayToDLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node prevNode = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prevNode);
            prevNode.next = temp;
            prevNode = temp;
        }

        return head;
    }

    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = convertArrayToDLL(arr);
        System.out.println("Constructed Doubly Linked List:");
        printDLL(head);
    }
}
