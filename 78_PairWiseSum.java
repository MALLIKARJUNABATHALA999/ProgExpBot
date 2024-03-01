import java.util.HashSet;

public class AASAMPLE {
    public static void main(String args[]) {
        int[] arr = {3,2,8,15,-8};
        int n=arr.length;
        System.out.println(pairwithGivenSum(arr,n,-6));
    }
    static boolean pairwithGivenSum(int arr[],int n, int sum){
       HashSet<Integer> s=new HashSet<>();
       for(int i=0;i<n;i++){
           if(s.contains(sum-arr[i])){
               return true;
           }
           s.add(arr[i]);
       }
        return false;

    }

}

