class Solution {
    public int minPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] grid=new int[m][n];
        grid[0][0]=matrix[0][0];
        for(int j=1;j<n;j++){
            grid[0][j]=matrix[0][j]+grid[0][j-1];
        }
        for(int i=1;i<m;i++){
            grid[i][0]=matrix[i][0]+grid[i-1][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j]=matrix[i][j]+Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        // System.out.println(Arrays.deepToString(grid));
        return grid[m-1][n-1];
    }
}
