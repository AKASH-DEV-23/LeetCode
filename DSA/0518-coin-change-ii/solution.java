class Solution {
    int[][] dp=new int[301][5001];
    public int change(int amount, int[] coins) {
        for(int[] arr:dp)   Arrays.fill(arr,-1);
        return solve(coins,0,amount);
    }
    private int solve(int[] coins, int i, int amount){
        if(amount==0)   return 1;
        if(i>=coins.length){
            return 0;
        }
        if(dp[i][amount]!=-1)   return dp[i][amount];
        if(amount<coins[i]){
            return solve(coins,i+1,amount);
        }
        int take=solve(coins,i,amount-coins[i]);
        int skip=solve(coins,i+1,amount);
        return dp[i][amount]= take+skip;
    }
}
