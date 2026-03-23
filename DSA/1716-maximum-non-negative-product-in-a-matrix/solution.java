class Solution {
    public int maxProductPath(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        long[][] minProduct=new long[row][col];
        long[][] maxProduct=new long[row][col];
        maxProduct[0][0]=minProduct[0][0]=grid[0][0];
        for(int j=1;j<col;j++){
            minProduct[0][j]=grid[0][j]*minProduct[0][j-1];
            maxProduct[0][j]=grid[0][j]*maxProduct[0][j-1];
        }

        for(int i=1;i<row;i++){
            minProduct[i][0]=minProduct[i-1][0]*grid[i][0];
            maxProduct[i][0]=maxProduct[i-1][0]*grid[i][0];
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                long val = grid[i][j];
                long a = minProduct[i - 1][j] * val;
                long b = maxProduct[i - 1][j] * val;
                long c = minProduct[i][j - 1] * val;
                long d = maxProduct[i][j - 1] * val;
                minProduct[i][j] = Math.min(Math.min(a, b), Math.min(c, d));
                maxProduct[i][j] = Math.max(Math.max(a, b), Math.max(c, d));
            }
        }

        if(maxProduct[row-1][col-1]<0)  return -1;
        return (int)(maxProduct[row-1][col-1]%1000000007);
    }
}
