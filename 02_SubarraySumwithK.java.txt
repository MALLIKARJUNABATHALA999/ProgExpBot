import java.util.*;
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        long sum=a[0];
        int maxlen=0;
        int leftsub=0;
        int rightsub=0;
        int  n=a.length;
        while(rightsub<n){
          
            while(leftsub<=rightsub && sum>k){   
                sum-=a[leftsub];
                leftsub++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,rightsub-leftsub+1);
            }
            rightsub++;
            if(right<n){
                sum+=a[rightsub];
            }
        }
        return maxlen;
    }
}