class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)    return image;
        Queue<int[]> q=new LinkedList<>();
        int mark=image[sr][sc];
        q.offer(new int[]{sr,sc});
        image[sr][sc]=color;
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
                    if(isSafe(image,newX,newY) && image[newX][newY]==mark){
                        q.offer(new int[]{newX,newY});
                        image[newX][newY]=color;
                    }
                }
            }
        }
        return image;
    }
    private boolean isSafe(int[][] image, int i, int j){
        int m=image.length;
        int n=image[0].length;
        return i>=0 && i<m && j>=0 && j<n;
    }
}
