class Solution {
    public int[] rearrangeArray(int[] nums) {
        int evenidx = 0, oddidx = 1;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[evenidx] = nums[i];
                evenidx += 2;
            } else {
                result[oddidx] = nums[i];
                oddidx += 2;
            }
        }

        return result;
    }
}