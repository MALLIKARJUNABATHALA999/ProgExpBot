Node delheadCircular(Node head){
   if(head==null) return null;
   if(head.next==head) return null;
   head.data=head.next.data;
   head.next=head.next.next;
   return head;
   }