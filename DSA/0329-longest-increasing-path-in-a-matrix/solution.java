class Solution {
    int maxi;
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        maxi=1;
        dp=new int[row][col];
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                int i=r;
                int j=c;
                if(dp[i][j]==0)
                    maxi=Math.max(maxi,DFS(matrix,i,j,-1));
            }
        }
        return maxi;
    }
    private int DFS(int[][] matrix, int i , int j, int prev){
        int row=matrix.length;
        int col=matrix[0].length;
        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length || matrix[i][j]<=prev)                     return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int up=DFS(matrix,i+1,j,matrix[i][j]);
        int down=DFS(matrix,i-1,j,matrix[i][j]);
        int left=DFS(matrix,i,j+1,matrix[i][j]);
        int right=DFS(matrix,i,j-1,matrix[i][j]);
        dp[i][j]=1+Math.max(Math.max(up,down), Math.max(left,right));
        return dp[i][j];
    }
}
