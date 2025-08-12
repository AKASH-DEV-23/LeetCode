class Solution {
    int[][] dp;
    final int MOD=1000_000_007;
    public int numberOfWays(int n, int x) {
        dp=new int[n+1][n+1];
        for(int[] arr:dp) Arrays.fill(arr,-1); 
        return solve(n,x,1,0);
    }
    private int solve(int n, int x, int idx, int sum){
        if(sum==n)  return 1;
        if(sum>n)   return 0;
        if(idx>n)   return 0;
        if(dp[idx][sum]!=-1)    return dp[idx][sum];
        int pow=(int)Math.pow(idx,x);
        if(pow>n)   return dp[idx][sum]=0;
        int pick=solve(n,x,idx+1,sum+pow);
        int notpick=solve(n,x,idx+1,sum);
        return dp[idx][sum]= (pick+notpick)%MOD;
    }
}