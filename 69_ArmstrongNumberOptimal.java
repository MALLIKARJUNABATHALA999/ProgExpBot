import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code 
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isArmstrong(num));
	}
	static boolean isArmstrong(int n){
		int originalnumber=n;
		int numberOfDigits=(int)Math.floor(Math.log10(n)+1);
		int sum=0;
		while(n>0){
			int digit=n%10;
			sum+=Math.pow(digit,numberOfDigits);
			n=n/10;
		}
		if(sum==originalnumber){
			return true;
		}
		else{
			return false;
		}
	}
}
