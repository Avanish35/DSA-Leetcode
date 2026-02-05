class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                // If value is 0, result[i] stays 0
                result[i] = 0;
            } else {
                // Compute the target index with wraparound
                int targetIndex = (i + (nums[i] % n) + n) % n;
                result[i] = nums[targetIndex];
            }
        }
        return result;
    }
}