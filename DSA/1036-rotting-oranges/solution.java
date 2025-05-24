class Solution {
    int cnt=0;
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean flag=true;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(q.isEmpty()){
            int fresh=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==1){
                        fresh++;
                    }
                }
            }
            return fresh>0?-1:0;
        }
        BFS(grid,q);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)   return -1;
            }
        }
        return cnt-1;
    }
    private void BFS(int[][] grid,Queue<int[]> q){
        int[][] directions=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            int n=q.size();
            cnt++;
            for(int idx=0;idx<n;idx++){
                int[] curr=q.poll();
                for(int[] dir:directions){
                    int newX=curr[0]+dir[0];
                    int newY=curr[1]+dir[1];
                    if(isSafe(grid,newX,newY)){
                        q.offer(new int[]{newX,newY});
                        grid[newX][newY]=2;
                    }
                }
            }
        }
    }
    private boolean isSafe(int[][] grid, int i, int j){
        int m=grid.length;
        int n=grid[0].length;
        return i>=0 && i<m && j>=0 && j<n && grid[i][j]==1;
    }
}
