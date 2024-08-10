class Solution {
    public int divide(int dividend, int divisor) {
       
        if (divisor == 1) return dividend;
        if (divisor == -1) {
            
            if (dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
            return -dividend;
        }


        boolean sign = (dividend > 0) == (divisor > 0);

        
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int ans = 0;

       
        while (n >= d) {
            long temp = d;
            int count = 1;
            while (n >= (temp << 1)) {
                temp <<= 1;
                count <<= 1;
            }
            n -= temp;
            ans += count;
        }

       
        ans = sign ? ans : -ans;

       
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return ans;
    }
}
