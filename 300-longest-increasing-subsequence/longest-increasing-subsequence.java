class Solution {
    int solve(int index, int prev, int[] nums, int[][]dp){
        if(index==nums.length){
            return 0;
        }
        if(dp[index][prev+1]!= -1){
            return dp[index][prev+1];
        }
        int skip = solve(index+1,prev,nums,dp);
        int take = 0;
        if(prev==-1 || nums[index]>nums[prev]){
            take = 1 + solve(index+1, index, nums, dp);
        }
        return dp[index][prev+1] = Math.max(take,skip);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(0, -1, nums, dp);
    }
}