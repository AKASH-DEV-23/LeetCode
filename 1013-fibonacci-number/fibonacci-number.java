class Solution {
    public int fib(int n) {
        int[] dp=new int[31];
        dp[1]=1;
        for(int i=2;i<=30;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}