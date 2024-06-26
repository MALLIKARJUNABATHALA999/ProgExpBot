class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap currentMax and currentMin when encountering a negative number
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            // Update currentMax and currentMin
            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);

            // Update maxProduct
            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }
}
