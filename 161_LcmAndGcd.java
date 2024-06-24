class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
      
        Long gcd = findGCD(A, B);
        Long lcm = (A * B) / gcd;
        return new Long[]{lcm, gcd};
    }
    
    static Long findGCD(Long A, Long B) {
        if (B == 0) {
            return A;
        }
        return findGCD(B, A % B);
    }
}