
class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node slow,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int cycleLength=1;
                slow=slow.next;
                while(slow!=fast){
                    slow=slow.next;
                    cycleLength++;
                }
                return cycleLength;
            }
        }
        return 0;
    }
    
}