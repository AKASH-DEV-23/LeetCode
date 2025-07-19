class Solution {
    public int countIslands(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    int[] arr=new int[1];
                    DFS(grid,i,j,arr);
                    if(arr[0]%k==0) cnt++;
                }
            }
        }
        return cnt;
    }
    private void DFS(int[][] grid, int i, int j, int[] arr){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)  return;
        arr[0]=arr[0]+grid[i][j];
        grid[i][j]=0;
        DFS(grid,i+1,j,arr);
        DFS(grid,i-1,j,arr);
        DFS(grid,i,j+1,arr);
        DFS(grid,i,j-1,arr);
    }
}