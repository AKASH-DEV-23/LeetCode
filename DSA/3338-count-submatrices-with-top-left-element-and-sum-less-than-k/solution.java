class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int row=grid.length;
        int col=grid[0].length;

        int[][] verticalSum=new int[row][col];
        int[][] horizontalSum=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j==0){
                    horizontalSum[i][j]=grid[i][j];
                }else{
                    horizontalSum[i][j]=horizontalSum[i][j-1]+grid[i][j];
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0){
                    verticalSum[i][j]=grid[i][j];
                }else{
                    verticalSum[i][j]=verticalSum[i-1][j]+grid[i][j];
                }
            }
        }

        for(int j=0;j<col;j++){
            grid[0][j]=horizontalSum[0][j];
        }

        for(int i=0;i<row;i++){
            grid[i][0]=verticalSum[i][0];
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                grid[i][j]=grid[i][j]+verticalSum[i-1][j]+
                horizontalSum[i][j-1]+grid[i-1][j-1];
            }
        }
        
        int totalSubMatrix=0;
        for(int[] temp:grid){
            for(int num:temp){
                if(num<=k)  totalSubMatrix++;
            }
        }
        return totalSubMatrix;
    }
}
