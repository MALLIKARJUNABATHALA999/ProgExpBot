class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = maxEle(weights);
        int high = sumOfWeights(weights);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShipInDays(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private int maxEle(int[] arr) {
        int res = Integer.MIN_VALUE;
        for (int num : arr) {
            res = Math.max(res, num);
        }
        return res;
    }

    private int sumOfWeights(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private boolean canShipInDays(int[] weights, int days, int capacity) {
        int totalDays = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                totalDays++;
                currentLoad = weight;
                if (totalDays > days) {
                    return false;
                }
            } else {
                currentLoad += weight;
            }
        }
        return totalDays <= days;
    }
}
