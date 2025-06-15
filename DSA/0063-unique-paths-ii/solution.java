class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==1 || grid[m-1][n-1]==1)   return 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)   grid[i][j]=-1;
            }
        }
        for(int j=0;j<n;j++){
            if(grid[0][j]==-1)  break;
            grid[0][j]=1;
        }
        for(int i=0;i<m;i++){
            if(grid[i][0]==-1)  break;
            grid[i][0]=1;
        }
        // System.out.println(Arrays.deepToString(grid));
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int sum=0;
                if(grid[i][j]!=-1){
                    if(grid[i][j-1] !=-1)   sum+=grid[i][j-1];
                    if(grid[i-1][j]!=-1)    sum+=grid[i-1][j];
                    grid[i][j]=sum;
                }
            }
        }
        return grid[m-1][n-1];
    }
}
