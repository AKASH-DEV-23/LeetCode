class Solution {
    int target=0;
    Boolean[][] dp=new Boolean[20001][201];
    public boolean canPartition(int[] nums) {
       int sum=0;
       for(int num:nums){
        sum+=num;
       } 
       target=sum/2;
       if(sum%2!=0) return false;
       return solve(nums,0,0);
    }
    private boolean solve(int[] nums, int sum,int i){
        if(sum==target) return true;
        if(sum>target || i>=nums.length)  return false;
        if(dp[sum][i]!=null)    return dp[sum][i];
        return dp[sum][i]=solve(nums,sum+nums[i],i+1) || solve(nums,sum,i+1);
    }
}
