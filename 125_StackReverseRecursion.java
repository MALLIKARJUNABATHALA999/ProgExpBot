import java.util.Stack;

public class Solution {
    static void reverse(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int temp = s.pop(); // Step 1: Pop the top element
            reverse(s); // Step 2: Recursively reverse the remaining stack
            insertAtBottom(s, temp); // Step 3: Insert the popped element at the bottom
        }
    }

    private static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x); // If the stack is empty, push x
        } else {
            int temp = st.pop(); // Pop the top element
            insertAtBottom(st, x); // Recursively insert x at the bottom
            st.push(temp); // Push the popped element back onto the stack
        }
    }
}
