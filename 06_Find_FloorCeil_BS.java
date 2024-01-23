import java.util.* ;
import java.io.*; 

public class Solution {
  
      public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        int f = getfloor(arr, n, x);
        int c = getceil(arr, n, x);
        return new int[] {f, c};
    }
    static  int getfloor(int[] arr,int n, int x){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
          int mid=low+(high-low)/2;
          if(arr[mid]<=x){
            ans=arr[mid];
           low=mid+1;
          }
          else{
            high=mid-1;
          }
        }
        return ans;
    }
    static int getceil(int[] arr,int n,int x){
      int low=0;
      int high=n-1;
      int ans=-1;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]>=x){
          ans=arr[mid];
          high=mid-1;
        }
        else{
          low=mid+1;
        }
      }
      return ans;
    }
    
}
