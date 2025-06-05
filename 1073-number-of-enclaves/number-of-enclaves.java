class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[0][i]==1){
                DFS(grid,0,i);
            }
            if(grid[m-1][i]==1){
                DFS(grid,m-1,i);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[i][0]==1){
                DFS(grid,i,0);
            }
            if(grid[i][n-1]==1){
                DFS(grid,i,n-1);
            }
        }
        int land=0;
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    land++;
                }
            }
        }
        return land;
    }
    private void DFS(int[][] grid, int i, int j){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        DFS(grid,i-1,j);
        DFS(grid,i+1,j);
        DFS(grid,i,j-1);
        DFS(grid,i,j+1);
    }
}