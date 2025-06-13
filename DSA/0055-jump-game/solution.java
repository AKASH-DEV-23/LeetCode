class Solution {
    Boolean[] dp=new Boolean[10001];
    public boolean canJump(int[] nums) {
        if(nums.length==1)  return true;
        return solve(nums,0);
    }
    private boolean solve(int[] nums, int idx){
        if(idx>=nums.length-1)  return true;
        if(dp[idx]!=null)   return dp[idx]; 
        int cnt=nums[idx];
        for(int i=1;i<=cnt;i++){
            if(solve(nums,i+idx))   return true;
        }
        return dp[idx]=false;
    }
}
