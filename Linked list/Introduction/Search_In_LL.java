class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class Seach_In_LL{
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        if (searchValue(head, 20)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    static boolean searchValue(Node head, int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}
