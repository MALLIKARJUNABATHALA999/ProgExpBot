public static void print_divisors(int n) {
    int i;
    for(i = 1; i * i <= n; i++) {
        if(n % i == 0) {
            System.out.print(i + " ");
        }
    }
    for(; i >= 1; i--) {
        if(i != (n / i) && n % i == 0) {
            System.out.print(n / i + " ");
        }
    }
}
