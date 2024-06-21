import java.util.*;
public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,2,1,3,3};
        int k=4;
        System.out.println(longestSubarraySumK(arr,k));
    }
    private static int longestSubarraySumK(int[] arr,int k){
        int sum=0;
        int left=0;
        int right=0;
        int n=arr.length;
        int maxlength=0;
       while(right<n){
           sum=sum+arr[right];
           while(left<=right && sum>k){
               sum-=arr[left];
               left++;
           }
           if(sum==k){
               maxlength=Math.max(maxlength,right-left+1);
           }

           right++;
       }
    return maxlength;
    }
}