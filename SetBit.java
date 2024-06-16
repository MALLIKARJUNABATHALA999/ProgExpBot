package src;

public class SetBit {
    public static void main(String args[]){
        int n=5;
        int k=2;
        int result = n & (1<<(k-1));
        if(result!=0){
            System.out.println(result);
            System.out.println(result);
        }
    }
}
