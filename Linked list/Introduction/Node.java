public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        Node y = new Node(arr[0]);

        System.out.println("Data: " + y.data);
        System.out.println("Next: " + y.next);
    }
}