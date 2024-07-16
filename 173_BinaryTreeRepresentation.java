class Solution{
    public static void createTree(Node root0, ArrayList<Integer> v ){
        // Code here
        if(v==null|| v.size()==0) return ;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root0);
        int i=1;
        while(i<v.size()){
            Node current=queue.poll();
            if(i<v.size()){
                current.left=new Node(v.get(i));
                queue.add(current.left);
                i++;
            }
            if(i<v.size()){
                current.right=new Node(v.get(i));
                queue.add(current.right);
                i++;
            }
        }
    }
}