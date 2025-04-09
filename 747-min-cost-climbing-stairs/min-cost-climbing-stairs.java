class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        int min1 = helper(cost, 0);
        int min2 = helper(cost, 1);
        return Math.min(min1, min2);
    }

    private int helper(int[] nums, int idx) {
        if (idx >= nums.length)
            return 0;
        if(dp[idx]!=-1) return dp[idx];
        int mini1 = nums[idx]+helper(nums, idx + 1);
        int mini2 = nums[idx]+helper(nums, idx + 2);
        return dp[idx] = Math.min(mini1, mini2);
    }
}