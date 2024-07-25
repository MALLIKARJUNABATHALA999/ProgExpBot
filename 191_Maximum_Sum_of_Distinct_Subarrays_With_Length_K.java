class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
           if (nums == null || nums.length < k) {
            return 0;
        }

        long maxSum = 0;
        long currentSum = 0;
        Map<Integer, Integer> elementCount = new HashMap<>();

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
            elementCount.put(nums[i], elementCount.getOrDefault(nums[i], 0) + 1);
        }

        if (elementCount.size() == k) {
            maxSum = currentSum;
        }

        for (int i = k; i < nums.length; i++) {
          
            int outElement = nums[i - k];
            currentSum -= outElement;
            elementCount.put(outElement, elementCount.get(outElement) - 1);
            if (elementCount.get(outElement) == 0) {
                elementCount.remove(outElement);
            }

            int inElement = nums[i];
            currentSum += inElement;
            elementCount.put(inElement, elementCount.getOrDefault(inElement, 0) + 1);

          
            if (elementCount.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}