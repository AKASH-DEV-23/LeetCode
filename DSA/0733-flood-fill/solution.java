class Solution {
    int preColor=0;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)    return image;
        preColor=image[sr][sc];
        DFS(image,sr,sc,color);
        return image;
    }
    private void DFS(int[][] image, int row, int col, int color){
        if(row<0 || row>=image.length || col<0 || col>=image[0].length || 
        image[row][col]!=preColor) return;
        image[row][col]=color;
        DFS(image,row+1,col,color);
        DFS(image,row-1,col,color);
        DFS(image,row,col+1,color);
        DFS(image,row,col-1,color);
    }
}

