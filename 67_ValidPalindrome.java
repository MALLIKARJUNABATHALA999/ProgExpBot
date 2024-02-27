class Solution {
    public boolean isPalindrome(String s) {
         String cleanString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
         int left = 0;
        int right = cleanString.length() - 1;

        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
             }
