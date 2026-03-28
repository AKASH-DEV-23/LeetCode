class Solution {
    public int minCost(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int ans=Integer.MAX_VALUE;
        
        Set<Integer>[][] dp=new HashSet[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                dp[i][j]=new HashSet<>();
            }
        }
        
        dp[0][0].add(grid[0][0]);

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i+1<row){
                    for(int val:dp[i][j]){
                        dp[i+1][j].add(val^grid[i+1][j]);
                    }
                }
                if(j+1<col){
                    for(int val:dp[i][j]){
                        dp[i][j+1].add(val^grid[i][j+1]);
                    }
                }
            }
        }

        for(int val:dp[row-1][col-1]){
            ans=Math.min(ans,val);
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }
    
}
