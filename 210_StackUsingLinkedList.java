class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
         StackNode temp = new StackNode(a);
        // If the stack is empty, make the new node the top
        if (top == null) {
            top = temp;
        } else {
            // Link the new node to the previous top
            temp.next = top;
            // Update the top to the new node
            top = temp;
        }
        
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if (top == null) {
            return -1;
        } else {
            // Store the data from the top node
            int res = top.data;
            // Move the top pointer to the next node
            top = top.next;
            // Return the data
            return res;
        }
    }
}
