class Solution {
    public int minScoreTriangulation(int[] values) {
        int n=values.length;
        Integer[][] dp=new Integer[n][n];
        return solve(values,0,n-1,dp);
    }
    private int solve(int[] arr, int i, int j, Integer[][] dp){
        if(j-i<2)    return 0;
        if(dp[i][j]!=null)  return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            int cost=arr[i]*arr[j]*arr[k]+solve(arr,i,k,dp)+solve(arr,k,j,dp);
            ans=Math.min(ans,cost);
        }
        return dp[i][j]=ans;
    }
}
