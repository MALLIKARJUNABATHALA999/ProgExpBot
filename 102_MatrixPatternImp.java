public class Solution {
    public static void getNumberPattern(int n) {
        // Write your code here.
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int value = Math.max(Math.abs(i - n + 1), Math.abs(j - n + 1))+1; // Calculate value based on distance
                            System.out.print(value);
            }
            System.out.println();
        }
    }
}
/*
4444444
4333334
4322234
4321234
4322234
4333334
4444444

Detailed explanation ( Input/output format, Notes, Images )
Constraints :

1  <= N <= 10^2
Time Limit: 1 sec

Sample Input 1:

3

Sample Output 1:

33333
32223
32123
32223
33333

Sample Input 2 :

5

Sample Output 2 :

555555555
544444445
543333345
543222325
543212345
543222325
543333345
544444445
555555555

Sample Input 3 :

4

Sample Output 3 :

4444444
4333334
4322234
4321234
4322234
4333334
4444444


*/