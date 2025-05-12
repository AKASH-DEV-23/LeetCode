class Solution {
    int zero;
    int row;
    int col;
    int path=0;
    public int uniquePathsIII(int[][] grid) {
        row=grid.length;
        col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0)   zero++;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    DFS(grid,i,j,0);
                }
            }
        }
        // System.out.println(zero);
        return path;
    }
    private void DFS(int[][] grid, int i, int j, int cnt){
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j]==-1)    return;
        if(grid[i][j]==2){
            // System.out.println("yess"+cnt);
            if(cnt==zero+1){
                // System.out.println("2 yes "+cnt);
                path++;
            }
            return;
        }
        cnt++;
        grid[i][j]=-1;
        DFS(grid,i+1,j,cnt);
        DFS(grid,i-1,j,cnt);
        DFS(grid,i,j+1,cnt);
        DFS(grid,i,j-1,cnt);
        cnt--;
        grid[i][j]=0;
    }
}
