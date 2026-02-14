class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;  // left pointer
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int j = 0; j < nums.length; j++) {  // right pointer
            sum += nums[j];

            while (sum >= target) {
                minLength = Math.min(minLength, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }
}
