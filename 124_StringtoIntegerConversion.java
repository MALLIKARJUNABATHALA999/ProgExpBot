class Solution {
    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        long num = 0; // Use long to prevent overflow
        int sign = 1;

        // Skip leading spaces
        while (i < chars.length && chars[i] == ' ') {
            i++;
        }

        // Handle sign
        if (i < chars.length && (chars[i] == '-' || chars[i] == '+')) {
            sign = chars[i] == '-' ? -1 : 1;
            i++;
        }

        // Process digits
        while (i < chars.length && Character.isDigit(chars[i])) {
            int digit = chars[i] - '0';
            num = num * 10 + digit;

            // Check for overflow
            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign == -1 && (-num) < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        // Apply sign
        num *= sign;

        // Check bounds
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) num;
        }
    }
}
