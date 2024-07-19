import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeRepresentation {
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        printLevel(root);
    }
    private static void printLevel(Node root){
        if(root==null) return;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        queue.add(null);
        while(queue.size()>1){
            Node curr=queue.poll();
            if(curr==null) {
                System.out.println();
                queue.add(null);
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }

    }
    static class Node{
        int data;
       Node left, right;
        Node(int item){
            data=item;
            left=null;
            right=null;
        }
    }
}
