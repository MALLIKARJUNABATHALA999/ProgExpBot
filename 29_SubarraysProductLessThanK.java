public class SubarrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int product = 1;
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            // At this point, all subarrays ending at the current 'right' index
            // have a product less than 'k'. So, we count these subarrays.
            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int result = numSubarrayProductLessThanK(nums, k);

        System.out.println("Number of subarrays with product less than " + k + ": " + result);
    }
}