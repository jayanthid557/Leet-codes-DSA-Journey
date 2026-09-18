class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Absolute_diff {
    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public int absDiff(Node root) {
        inOrder(root);
        return min;
    }

    private void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);

        if (prev != null) {
            min = Math.min(min, root.data - prev);
        }
        prev = root.data;

        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        // Fixed: Instantiated the correct class name
        Absolute_diff solver = new Absolute_diff();
        int result = solver.absDiff(root);

        System.out.println("Minimum Absolute Difference: " + result);
    }
}
