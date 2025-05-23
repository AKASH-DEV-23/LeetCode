class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    BFS(grid,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void BFS(char[][] grid, int i, int j){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});
        grid[i][j]='0';
        int[][] directions=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            int[] current=q.poll();
            for(int[] dir:directions){
                int newX=current[0]+dir[0];
                int newY=current[1]+dir[1];
                if(isSafe(grid,newX,newY)){
                    q.offer(new int[]{newX,newY});
                    grid[newX][newY]='0';
                }
            }
        }
    }

    private void DFS(char[][] grid, int i, int j){
        if(!isSafe(grid,i,j))   return;
        grid[i][j]='0';
        BFS(grid,i-1,j);
        BFS(grid,i+1,j);
        BFS(grid,i,j-1);
        BFS(grid,i,j+1);
    }
    
    private boolean isSafe(char[][] grid, int i, int j){
        return i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]=='1';
    }
}
