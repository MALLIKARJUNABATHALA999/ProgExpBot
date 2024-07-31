
class Solution {
    Node constructDLL(int arr[]) {
        if(arr.length==1){
            return new Node(arr[0]);
        }
        Node head=new Node(arr[0]);
        Node prevv=head;
        for(int i=1;i<arr.length;i++){
            Node curr=new Node(arr[i]);
            prevv.next=curr;
            curr.prev=prevv;
            prevv=curr;
            
        }
        return head;
        
    }
}