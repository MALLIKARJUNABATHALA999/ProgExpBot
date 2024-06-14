import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String args[]) {
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                if(prime(i)){
                    list.add(i);
                }
                if(n/i!=i){
                    if(prime(n/i)) list.add(n/i);
                }
            }
        }
    }
   
}
