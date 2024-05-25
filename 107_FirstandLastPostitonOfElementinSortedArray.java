public class Solution {

  public int[] searchRange(int[] nums, int target) {
    int n = nums.length;
    int low = 0;
    int high = n - 1;
    int[] result = new int[] {-1, -1}; // Use initializer list for clarity

    if (n == 0 || nums[low] > target || nums[high] < target) {
      // Handle empty array or target outside array range
      return result;
    }

    // Standard binary search loop
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == target) {
        // Found target, search for first and last occurrences
        int left = mid, right = mid;
        while (left >= 0 && nums[left] == target) {
          left--;
        }
        while (right < n && nums[right] == target) {
          right++;
        }
        result[0] = left + 1; // First occurrence is left element + 1
        result[1] = right - 1; // Last occurrence is right element - 1
        return result;
      } else if (nums[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return result; // Target not found
  }
}
