class Solution {
    public int uniquePathsWithObstacles(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        if(matrix[m-1][n-1]==1 || matrix[0][0]==1) return 0;
        int[][] grid=new int[m][n];
        for(int j=0;j<n;j++){
            if(matrix[0][j]==1) break;
            else   grid[0][j]=1;
        }
        for(int i=0;i<m;i++){
            if(matrix[i][0]==1) break;
            else    grid[i][0]=1;
        }
        // System.out.print(Arrays.deepToString(grid));
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int path=0;
                if(matrix[i-1][j]!=1)   path+=grid[i-1][j];
                if(matrix[i][j-1]!=1)   path+=grid[i][j-1];
                grid[i][j]=path;
            }
        }
        return grid[m-1][n-1];
    }
}
