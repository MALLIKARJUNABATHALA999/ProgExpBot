import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if (!ismatch(top, c)) {
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }

    private static boolean ismatch(char a, char b) {
        return (a == '(' && b == ')') ||
               (a == '[' && b == ']') ||
               (a == '{' && b == '}');
    }
}
