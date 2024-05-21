
class Solution{
    static int evenlyDivides(int N){
        // code here
        int num=N;
        int count=0;
        while(num!=0){
            int digit=num%10;
            num=num/10;
            if(digit!=0){
                if(N%digit==0){
                        count++;
            }
            
            }
        }
        return count;
    }
}