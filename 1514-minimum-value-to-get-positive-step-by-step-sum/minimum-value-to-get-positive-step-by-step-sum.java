class Solution {
    public int minStartValue(int[] nums) {
        int currentSum = 0;
        int minSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum < minSum) {
                minSum = currentSum;
            }
        }
        return Math.max(1, 1 - minSum);
    }
}