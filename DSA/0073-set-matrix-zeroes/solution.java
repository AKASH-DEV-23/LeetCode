class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[] horizontal=new int[col];
        int[] vertical=new int[row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    horizontal[j]=1;
                    vertical[i]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(horizontal[j]==1 || vertical[i]==1)  matrix[i][j]=0;
            }
        }
    }
}
