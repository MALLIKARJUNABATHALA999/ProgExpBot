import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; 

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true); 
        isPrime[0] = false; 
        isPrime[1] = false;
        
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    private static boolean prime(int n) {
        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
            if (count > 2) break;
        }
        return count == 0;
    }
}
