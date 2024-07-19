class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)>1) return false;
        return isBalanced(root.left)&& isBalanced(root.right);

    }
    public static int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
}