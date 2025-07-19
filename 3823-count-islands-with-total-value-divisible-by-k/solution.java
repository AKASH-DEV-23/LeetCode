class Solution {
    static int sum;
    public int countIslands(int[][] grid, int k) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    sum=0;
                    int[] ans=new int[1];
                    DFS(grid,i,j,ans);
                    if(ans[0]%k==0)  cnt++;
                    // System.out.print(ans[0]+" ");
                }
            }
        }
        return cnt;
    }
    private void DFS(int[][] grid, int i, int j, int[] sum){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0)  return;
        // int temp=grid[i][j];
        sum[0]=sum[0]+grid[i][j];
            grid[i][j]=0;
        DFS(grid,i+1,j,sum);
        DFS(grid,i-1,j,sum);
        DFS(grid,i,j+1,sum);
        DFS(grid,i,j-1,sum);
    }
}
