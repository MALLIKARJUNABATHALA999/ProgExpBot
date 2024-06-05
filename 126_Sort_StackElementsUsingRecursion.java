import java.util.Stack;

class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if (s.isEmpty()) {
            return s;
        }
        int temp = s.pop();
        sort(s);
        insertAtCorrectPosition(s, temp);
        return s;
    }

    private void insertAtCorrectPosition(Stack<Integer> s, int ele) {
        if (s.isEmpty() || s.peek() < ele) {
            s.push(ele);
            return;
        }
        int temp = s.pop();
        insertAtCorrectPosition(s, ele);
        s.push(temp);
    }
}
