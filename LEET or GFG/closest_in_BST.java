import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class closest_in_BST {
    int min = Integer.MAX_VALUE;

    public int minDiff(Node root, int k) {
        help(root, k);
        return min;
    }

    void help(Node root, int k) {
        if (root == null) {
            return;
        }

        int curr = Math.abs(root.data - k);
        min = Math.min(min, curr);

        if (k < root.data) {
            help(root.left, k);
        } else if (k > root.data) {
            help(root.right, k);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(11);
        root.left.left = new Node(1);
        root.left.right = new Node(5);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(6);

        int k = 13;
        closest_in_BST sol = new closest_in_BST();
        System.out.println(sol.minDiff(root, k));
    }
}
