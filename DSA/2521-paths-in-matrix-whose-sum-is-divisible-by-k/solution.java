class Solution {
    int ans=0;
    int m;
    int n;
    int mod;
    Integer[][][] dp;
    public int numberOfPaths(int[][] grid, int k) {
        m=grid.length;
        n=grid[0].length;
        mod=k;
        dp=new Integer[m][n][k];
        return solve(grid,grid[0][0]%mod,0,0);
    }
    private int solve(int[][] grid,int sum, int i, int j){
        if(i==m-1 && j==n-1){
            if(sum==0){
               return 1;
            }  
            return 0;
        }
        if(dp[i][j][sum]!=null){
            return dp[i][j][sum];
        }
        int ways=0;
        if(i+1<m){
            int newSum=(sum+grid[i+1][j])%mod;
            ways=ways+solve(grid,newSum,i+1,j);
        }
        if(j+1<n){
            int newSum=(sum+grid[i][j+1])%mod;
            ways+=solve(grid,newSum,i,j+1);
        }
        return dp[i][j][sum]=ways%1000000007;
    }
}
