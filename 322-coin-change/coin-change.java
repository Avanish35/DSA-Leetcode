class Solution {
    int solve(int[] coins,int amount,int[] dp) {

        if (amount == 0)
            return 0;

        if (amount < 0)
            return Integer.MAX_VALUE;

        if (dp[amount] != -1)
            return dp[amount];

        int mini = Integer.MAX_VALUE;

        for (int i = 0;i < coins.length; i++) {

            int ans =solve(coins,amount - coins[i],dp);

            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini,1 + ans);
            }
        }
        return dp[amount] = mini;
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans =solve(coins, amount,dp);
        return ans == Integer.MAX_VALUE? -1 : ans;
    }
}