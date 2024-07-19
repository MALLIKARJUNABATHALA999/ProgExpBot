
    import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
    public class Main {
        public  void main(String args[]) {
            Node root = new Node(10);
            root.left = new Node(20);
            root.right = new Node(30);
            root.left.left = new Node(40);
            root.left.right = new Node(50);
            System.out.println(getMax(root));
        }
        private static int getMax(Node root){
            if(root==null) return 0;
            return 1+getMax(root.left)+getMax(root.right);
        }


        static class Node {
            int data;
            Node left, right;

            Node(int item) {
                data = item;
                left = null;
                right = null;
            }
        }

    }

