class Solution {
    int[][] grid;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int m=image.length;
        int n=image[0].length;
        grid=new int[m][n];
        for(int[] gr:grid)  Arrays.fill(gr,-1);
        // BFS(image,sr,sc,color);
        DFS(image,sr,sc,image[sr][sc],color);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]!=-1)     grid[i][j]=image[i][j];
            }
        }
        return grid;
    }
    private void BFS(int[][] image, int i, int j, int color){
        Queue<int[]> q=new LinkedList<>();
        int orgPxl=image[i][j];
        q.offer(new int[]{i,j});
        image[i][j]=-1;
        grid[i][j]=color;
        int[][] directions=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            for(int[] dir:directions){
                int newX=curr[0]+dir[0];
                int newY=curr[1]+dir[1];
                if(isSafe(image,newX,newY,orgPxl)){
                    q.offer(new int[]{newX,newY});
                    image[newX][newY]=-1;
                    grid[newX][newY]=color;
                }
            }
        }
    }
    private boolean isSafe(int[][] image, int i, int j, int orgPxl){
        return i>=0 && i<image.length && j>=0 && j<image[0].length && image[i][j]==orgPxl;
    }
    private void DFS(int[][] image, int i, int j, int orgPxl, int color){
        if(!isSafe(image, i, j, orgPxl))  return;
        image[i][j]=color;
        DFS(image,i-1,j,orgPxl,color);
        DFS(image,i+1,j,orgPxl,color);
        DFS(image,i,j-1,orgPxl,color);
        DFS(image,i,j+1,orgPxl,color);
    }
}