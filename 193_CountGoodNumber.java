class Solution {
    public static int MOD=1000000007;
    public long pow(long x,long n){
        
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        x=x%MOD;
        long result=1;
        while(n>0){
            if(n%2==1){
                result=(result*x)%MOD;
            }
            x=(x*x)%MOD;
            n=n/2;
        }
        return result;
    }
    public int countGoodNumbers(long n) {

        long evenPos=(n+1)/2;
        long oddPos=n/2;
        long evenCount=pow(5,evenPos);
        long oddCount=pow(4,oddPos);

        return (int)((evenCount*oddCount)%MOD);
    }
}
