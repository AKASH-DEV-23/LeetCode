class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1)   return -1;
        return BFS(grid);
    }

    private int BFS(int[][] grid){
        int lvl=0;
        int n=grid.length;
        Queue<int[]> q=new LinkedList<>();
        int[][] allDir=new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{1,-1},{-1,-1}};
        q.offer(new int[]{0,0});
        grid[0][0]=1;
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                int[] axis=q.poll();
                int x=axis[0];
                int y=axis[1];
                if(x==n-1 && y==n-1)    return lvl+1;
                for(int[] dir:allDir){
                    int newX=x+dir[0];
                    int newY=y+dir[1];
                    if(isSafe(newX,newY,n) && grid[newX][newY]==0){
                        q.offer(new int[]{newX,newY});
                        grid[newX][newY]=1;
                    }
                }
            }
            lvl++;
        }
        return -1;
    }
    private boolean isSafe(int x, int y, int n){
        return x>=0 && x<n && y>=0 && y<n; 
    }
}