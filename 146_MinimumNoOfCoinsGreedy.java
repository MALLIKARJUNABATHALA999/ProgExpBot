import java.util.*;
public class Main {
    public static void main(String[] args) {
       int[] coins={5,2,1,10};
       int amount=57;
       System.out.println(mincoins(coins,amount));
    }
    public static int mincoins(int[] coins,int amount){
        Arrays.sort(coins);
        int res=0;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                int c=(int)Math.floor(amount/coins[i]);
                res=res+c;
                amount=amount-c*coins[i];
            }
            if(amount==0){
                break;
            }
        }
        return res;
    }
}