
class Solution {
    public static void print_divisors(int n) {
        // code here
         int i;
        // First loop: Print all divisors up to sqrt(n)
        for(i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        // Second loop: Print the corresponding divisors greater than sqrt(n)
        for(i = (int)Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                System.out.print((n / i) + " ");
            }
        }
    }
}
