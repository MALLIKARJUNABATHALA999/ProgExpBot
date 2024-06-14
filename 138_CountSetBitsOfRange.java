
class Solution {
     public static int countSetBits(int n) {
        int totalCount = 0;
        int i = 0;
        
        while ((1 << i) <= n) {
            int k = (1 << (i + 1));
            totalCount += (n / k) * (k >> 1);
            if ((n & ((1 << (i + 1)) - 1)) >= (1 << i)) {
                totalCount += (n & ((1 << (i + 1)) - 1)) - (1 << i) + 1;
            }
            i++;
        }
        return totalCount;
    }
}