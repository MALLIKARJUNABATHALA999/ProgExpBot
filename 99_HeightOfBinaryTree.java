public class Sample {
    public static void main(String args[]) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.right.left=new TreeNode(40);
        root.right.right=new TreeNode(50);
        int result=height(root);
        System.out.println(result);
    }
    static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            return Math.max(height(root.left),height(root.right))+1;
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
