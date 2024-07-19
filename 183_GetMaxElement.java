int getMaxElement(Node root){

        if(root==null) return Integer.MIN_VALUE;;
           return Math.max(root.data,Math.max(getMaxElement(root.left),getMaxElement(root.right)));
}