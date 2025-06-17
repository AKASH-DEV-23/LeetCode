class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        boolean flag=true;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)   flag=false;
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(flag)    return 0;
        int[][] directions=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        int cnt=0;
        while(!q.isEmpty()){
            int k=q.size();
            for(int i=0;i<k;i++){
                int[] cordi=q.poll();
                int x=cordi[0];
                int y=cordi[1];
                for(int[] dir:directions){
                    int newX=x+dir[0];
                    int newY=y+dir[1];
                    if(newX>=0 && newX<m && newY>=0 && newY<n && grid[newX][newY]==1){
                        q.offer(new int[]{newX,newY});
                        grid[newX][newY]=2;
                    }
                }
            }
            cnt++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)   return -1;
            }
        }
        return cnt-1;
    }
    
}
