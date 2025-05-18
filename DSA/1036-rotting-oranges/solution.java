class Solution {
    int m;
    int n;
    int time=0;
    public int orangesRotting(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    DFS(grid,i,j,2);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)   return -1;
                time=Math.max(time,grid[i][j]);
            }
        }
        if(time==0) return 0;
        return time==2 ? 0 : time-2;
    }
    private void DFS(int[][] grid, int i, int j, int currTime){
        if(i<0 || j<0 || i>=m || j>=n)  return;
        if(grid[i][j]!=1 && grid[i][j]<currTime)    return;
        grid[i][j]=currTime;
        DFS(grid,i-1,j,currTime+1);
        DFS(grid,i+1,j,currTime+1);
        DFS(grid,i,j-1,currTime+1);
        DFS(grid,i,j+1,currTime+1);
    }
}
