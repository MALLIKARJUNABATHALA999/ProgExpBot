import java.util.*;
public class Main {
    public static void main(String[] args) {
       int[] arr={10,8,5,12,15,7,6};
       int n=arr.length;
       int k=3;
       MaxSubArray(arr,n,k);


   }
   private static void MaxSubArray(int[] arr,int n,int k){
       for(int i=0;i<n-k+1;i++){
           int max=arr[i];
           for(int j=i+1;j<k+i;j++){
               max=Math.max(max,arr[j]);
           }
           System.out.println(max);
       }

   }
}