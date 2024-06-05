class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        double res = 1.0;
        
        if (nn == 0) {
            return 1.0;
        }
        
        if (nn < 0) {
            x = 1.0 / x;
            nn = -nn;
        }
        
        while (nn > 0) {
            if (nn % 2 == 1) {
                res *= x;
            }
            x *= x;
            nn /= 2;
        }
        
        return res;
    }
}
