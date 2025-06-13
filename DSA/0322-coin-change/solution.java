class Solution {
    int mini=Integer.MAX_VALUE;
    int[][] dp=new int[13][10001];
    public int coinChange(int[] coins, int amount) {
        for(int[] arr:dp)   Arrays.fill(arr,-1);
        solve(coins,0,0,amount);
        return mini==Integer.MAX_VALUE ? -1 :mini;
    }
    private void solve(int[] coins, int i,int cnt, int amount){
        if(amount==0){
            mini=Math.min(mini,cnt);
            return;
        }
        if(dp[i][amount]!=-1 && dp[i][amount]<=cnt)   return;
        dp[i][amount]=cnt;
        if(i>=coins.length){
            return;
        }
        if(amount<coins[i]){
            solve(coins,i+1,cnt,amount);
            return;
        }
        solve(coins,i,cnt+1,amount-coins[i]);
        solve(coins,i+1,cnt,amount);
    }
}
