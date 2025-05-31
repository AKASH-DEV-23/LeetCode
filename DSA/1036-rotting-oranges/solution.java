class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        for(int[] mat:grid){
            for(int num:mat){
                if(num==1)  fresh++;
            }
        }
        if(fresh==0)    return 0;
        int ans=BFS(grid);
        for(int[] mat:grid){
            for(int num:mat){
                if(num==1)  return -1;
            }
        }
        return ans-1;
    }
    private int BFS(int[][] grid){
        int cnt=0;
        Queue<int[]> q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[][] directions=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            int k=q.size();
            for(int i=0;i<k;i++){
                int[] cordi=q.poll();
                int x=cordi[0];
                int y=cordi[1];
                for(int[] dir:directions){
                    int newX=x+dir[0];
                    int newY=y+dir[1];
                    if(isSafe(grid,newX,newY) && grid[newX][newY]==1){
                        q.offer(new int[]{newX,newY});
                        grid[newX][newY]=2;
                    }
                }
            }
            cnt++;
        }
        return cnt;
    }
    private boolean isSafe(int[][] grid, int i, int j){
        int m=grid.length;
        int n=grid[0].length;
        return i>=0 && i<m && j>=0 && j<n;
    }
}
