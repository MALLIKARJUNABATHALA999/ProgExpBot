class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxele(piles);
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long timereq=reqtime(piles,mid);
            if(timereq<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
          return ans;
    }
  
    public static long  reqtime(int[] arr,int val){
        long time=0;
        for(int i=0;i<arr.length;i++){
            time+=(long)Math.ceil((double)arr[i]/val);
        }
        return time;
    }
    public static int maxele(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}