class Solution {
    public int arrayNesting(int[] nums) {
        int maxlen = 0;
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!visited.contains(i)) {
                int length = 0;
                int ptr = i;
                
                while (!visited.contains(ptr)) {
                    visited.add(ptr);
                    ptr = nums[ptr];
                    length++;
                }
                
                maxlen = Math.max(maxlen, length);
            }
        }
        return maxlen;
    }
}