class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums)   sum+=num;
        if(sum%2!=0)    return false;
        dp=new Boolean[201][20001];
        return solve(nums,sum/2,0);
    }
    private boolean solve(int[] nums, int sum,int i){
        if(sum==0)  return true;
        if(i>=nums.length || sum<0)  return false;
        if(dp[i][sum]!=null)   return dp[i][sum];
        boolean take=solve(nums,sum-nums[i],i+1);
        boolean notTake=solve(nums,sum,i+1);
        return dp[i][sum] = take || notTake;
    }
}
