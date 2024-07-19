public class Main {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(11);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.left.left.left = new Node(14);
        root.left.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(12);
        root.right.left.left = new Node(6);
        root.right.left.right = new Node(15);
        root.right.right.left = new Node(1);
        root.right.right.right = new Node(7);
        
        System.out.print(getSum(root));
    }

    private static int getSum(Node root) {
        if (root == null) return 0;
        return root.data + getSum(root.left) + getSum(root.right);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
