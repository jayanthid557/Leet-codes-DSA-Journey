public class length_of_ll {

    static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30};

        Node head = null;
        Node tail = null;

        for (int i : a) {

            Node newNode = new Node(i);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Length = " + count);
    }
}