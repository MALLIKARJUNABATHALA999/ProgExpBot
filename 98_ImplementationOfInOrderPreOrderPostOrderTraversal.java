public class Sample {
    public static void main(String args[]) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.right.left=new TreeNode(40);
        root.right.right=new TreeNode(50);
        preorder(root);
    }
    static void preorder(TreeNode root){
        if(root!=null){
            System.out.println(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    /*static void postorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            inorder(root.right);
            System.out.println(root.key+" ");
        }
    }*/
    /*static void inorder(TreeNode root){
        if(root!=null){
            System.out.println(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }*/
}
class TreeNode{
    int key;
    TreeNode left;
    TreeNode right;
    TreeNode(int k){
        key=k;
    }
}
