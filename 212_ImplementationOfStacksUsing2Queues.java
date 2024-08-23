import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q2.offer(x);
        while (!q1.isEmpty()) {
            q2.offer(q1.remove());
        }
        // Swap the queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    public int pop() {
        if (q1.isEmpty()) {
            return -1; // or throw exception
        }
        return q1.remove();
    }
    
    public int top() {
        if (q1.isEmpty()) {
            return -1; // or throw exception
        }
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}