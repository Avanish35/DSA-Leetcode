class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;
        int i = 1;
        //strictly increasing
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }
        if (i == 1 || i == n) return false;

        // strictly decreasing
        int downStart = i;
        while (i < n && nums[i] < nums[i - 1]) {
            i++;
        }
        if (i == downStart || i == n) return false;

        // strictly increasing
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }
        return i == n;
    }
}
