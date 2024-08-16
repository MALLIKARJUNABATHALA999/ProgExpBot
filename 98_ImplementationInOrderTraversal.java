package src;

public class Sample {
    public static void main(String args[]) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.right.left=new TreeNode(40);
        root.right.right=new TreeNode(50);
        inorder(root);
    }
    static void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.key+" ");
            inorder(root.right);
        }
    }
}
class TreeNode{
    int key;
    TreeNode left;
    TreeNode right;
    TreeNode(int k){
        key=k;
    }
}
