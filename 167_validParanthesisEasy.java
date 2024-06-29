class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int balance = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (balance > 0) {
                    str.append(c);
                }
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance > 0) {
                    str.append(c);
                }
            }
        }

        return str.toString();
    }

} 
