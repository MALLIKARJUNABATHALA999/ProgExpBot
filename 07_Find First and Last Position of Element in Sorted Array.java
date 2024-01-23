class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fst=firstposition(nums,target);
        int lst=lastposition(nums,target);
        int result[]={fst,lst};
        return result;

    }
    public static int firstposition(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int fstidx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                fstidx=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return fstidx;
    }
    public static int lastposition(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        int lstidx=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                lstidx=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return lstidx;
    }
}