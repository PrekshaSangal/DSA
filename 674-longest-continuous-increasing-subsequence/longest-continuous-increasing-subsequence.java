class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int maxLen = 1, currLen = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
        }
        return maxLen;
    }
}
