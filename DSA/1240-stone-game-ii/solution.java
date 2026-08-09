class Solution {
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int[] suffix=new int[n];
        int[][] dp=new int[n][n+1];
        suffix[n-1]=piles[n-1];

        for(int[] singleDP:dp)  Arrays.fill(singleDP,-1);

        for(int i=n-2;i>=0;i--){
            suffix[i]=piles[i]+suffix[i+1];
        }

        return solve(0,1,piles,suffix,dp);
    }

    private int solve(int idx, int M, int[] piles, int[] suffix,int[][] dp){
        if(idx==piles.length)   return 0;
        if(dp[idx][M]!=-1)    return dp[idx][M];
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<=Math.min(2*M,piles.length-idx);i++){
            ans=Math.max(ans,suffix[idx]-solve(idx+i,Math.max(i,M),piles,suffix,dp));
        }
        return dp[idx][M]=ans;
    }
}
