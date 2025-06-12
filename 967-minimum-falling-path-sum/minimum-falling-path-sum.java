class Solution {
    int n;
    public int minFallingPathSum(int[][] matrix) {
        n=matrix.length;
        int[][] grid=new int[n][n];
        for(int j=0;j<n;j++){
            grid[0][j]=matrix[0][j];
        }
        for(int row=1;row<n;row++){
            for(int col=0;col<n;col++){
                grid[row][col]=findMin(grid,row,col)+matrix[row][col];
            }
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            min=Math.min(min,grid[n-1][j]);
        }
        return min;
    }
    private int findMin(int[][] matrix, int row, int col){
        int min=Integer.MAX_VALUE;
        if(col-1>=0)    min=Math.min(min,matrix[row-1][col-1]);
        if(col+1<n)     min=Math.min(min,matrix[row-1][col+1]);
        min=Math.min(min,matrix[row-1][col]);
        return min;
    }
}