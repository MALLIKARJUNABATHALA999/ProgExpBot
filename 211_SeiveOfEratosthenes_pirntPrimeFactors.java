class Solution {
    static int N;  // Declare N as a class-level variable
    static boolean[] isPrime;
    static List<Integer> primes;

    // Implementing the sieve function without passing N
    static void sieve() {
        isPrime = new boolean[N + 1];
        primes = new ArrayList<>();

        // Initially, assume all numbers are prime
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Collect all prime numbers
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
    }

    // Function to find prime factors of a given number N
    static List<Integer> findPrimeFactors(int num) {
        N = num;  // Set the class-level variable N
        sieve();  // Compute all primes up to N
        List<Integer> primeFactors = new ArrayList<>();

        // Finding prime factors
        for (int prime : primes) {
            if (prime * prime > N) break;  // No need to check beyond sqrt(N)
            while (N % prime == 0) {
                primeFactors.add(prime);
                N /= prime;
            }
        }
        
        // If N is still greater than 1, then it is a prime number
        if (N > 1) {
            primeFactors.add(N);
        }

        return primeFactors;
    }
// User function Template for Java
}