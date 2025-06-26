class Solution {
    int[] dp=new int[46];
    public int climbStairs(int n) {
        if(dp[n]!=0)   return dp[n];
        if(n==2)    return 2;
        if(n==1)    return 1;
        if(n<=0)    return 0;
        return dp[n] = climbStairs(n-1)+climbStairs(n-2);
    }
}
