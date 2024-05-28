class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=maxEle(nums);
       int  ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Divisor(nums,mid,threshold)==true){
                ans= mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
           
        }
        return ans;
    }
    public boolean Divisor(int[] arr,int val,int threshold){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/val);
        }
        if(sum<=threshold){
            return true;
        }
        return false;
    }
    private int maxEle(int[] arr){
        int res=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>res){
                res=arr[i];
            }
        }
        return res;
    }
}