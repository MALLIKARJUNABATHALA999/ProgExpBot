class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int p0=0;
        int p2=n-1;
        int curr=0;
        while(curr<=p2){
            if(nums[curr]==0){
                int temp=nums[p0];
                nums[p0]=nums[curr];
                nums[curr]=temp;
                p0+=1;
                curr+=1;
            }
            else if(nums[curr]==2){
                int temp=nums[p2];
                nums[p2]=nums[curr];
                nums[curr]=temp;
                p2-=1;
                curr+=1;
            }
            else{
                curr+=1;
            }
        }
    }
}