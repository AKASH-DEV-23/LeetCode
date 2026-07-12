class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m=grid.length;
        int n=grid[0].length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int ans=1;

        for(int j=1;j<n;j++){
            for(int i=0;i<j;i++){
                boolean flag=true;
                for(int r=0;r<m;r++){
                    if(Math.abs(grid[r][j]-grid[r][i])>limit){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    dp[j]=Math.max(dp[j],dp[i]+1);
                }
            }
            ans=Math.max(ans,dp[j]);
        }
        return ans;
    }
}
