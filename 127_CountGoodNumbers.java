class Solution {
    private static final int mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long result=(power(5,even,mod)*power(4,odd,mod))%mod;
        return (int)result;
    }
    private static long power(long base,long exp,int mod){
        long result=1;
        while(exp>0){
            if((exp%2)==1){
                result=(result*base)%mod;
            }
            base=(base*base)%mod;
            exp=exp/2;

        }
        return result;
    }

}