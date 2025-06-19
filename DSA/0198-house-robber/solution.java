class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp=new int[101];
        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
    private int solve(int[] nums, int idx){
        if(idx>=nums.length)    return 0;
        if(dp[idx]!=-1) return dp[idx];
        int steal=nums[idx] + solve(nums,idx+2);
        int skip=solve(nums,idx+1);
        return dp[idx]=Math.max(steal,skip);
    }
}
