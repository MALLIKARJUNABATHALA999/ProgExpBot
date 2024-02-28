import java.util.HashSet;

public class PairWIthGivenSum {
    public static void main(String args[]){
        int arr[]={3,2,8,15,-8};
        int sum=17;
        System.out.println(isPair(arr,arr.length,sum));
    }
    public static boolean isPair(int[] nums,int n,int sum){
        HashSet<Integer> s=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(s.contains(sum-nums[i])){
                return true;
            }
            s.add(nums[i]);
        }
        return false;
    }
}
