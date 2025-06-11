class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)    return image;
        BFS(image,sr,sc,color);
        return image;
    }
    private void BFS(int[][] grid, int sr, int sc, int color){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{sr,sc});
        int curr=grid[sr][sc];
        grid[sr][sc]=color;
        int[][] directions={{0,-1},{0,1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                int[] cordi=q.poll();
                int x=cordi[0];
                int y=cordi[1];
                for(int [] dir:directions){
                    int newX=x+dir[0];
                    int newY=y+dir[1];
                    if(newX>=0 && newX<grid.length && newY>=0 && newY<grid[0].length && 
                        grid[newX][newY]==curr){
                        q.offer(new int[]{newX,newY});
                        grid[newX][newY]=color;
                    }
                }
            }
        }
    }
}
