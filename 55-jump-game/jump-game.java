class Solution {
    Boolean[] dp;
    int n;
    public boolean canJump(int[] nums) {
        n=nums.length;
        dp=new Boolean[n];
        return solve(nums,0);
    }
    private boolean solve(int[] arr, int idx){
        if(idx>=n-1)  return true;
        if(dp[idx]!=null) return dp[idx];
        for(int i=1;i<=arr[idx];i++){
            if(solve(arr,idx+i))    return dp[idx]= true;
        }
        return dp[idx]=false;
    }

}