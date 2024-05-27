class Solution {
    public int NthRoot(int n, int m) {
        int low = 1;
        int high = m;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long nthroot = power(mid, n);
            if (nthroot == m) {
                return mid;
            } else if (nthroot > m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        return result;
    }
}
