class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
	    QueueNode temp=new QueueNode(a);
	    if(rear==null){
	        front=rear=temp;
	        return;
	    }
     
     rear.next=temp;
     rear=temp;
	    
	    
        // Your code here
	}
	

	int pop()
	{
	    if(front==null){
	        return -1;
	    }
        QueueNode temp=front;
        front=front.next;
        if(front==null){
            rear=null;
        }
        return temp.data;
	}
}




