class Solution {
    public int maxProduct(int[] nums) {
        int prefix=0;
        int suffix=0;
        int n=nums.length;
        int maxprod=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(suffix==0) suffix=1;
            if(prefix==0) prefix=1;
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];
            maxprod=Math.max(maxprod,Math.max(suffix,prefix));
        }
        return maxprod;
    }
}
