class Solution {
    public void setZeroes(int[][] mat) {
        int newCol=1;

        int row=mat.length;
        int col=mat[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    if(j!=0)
                        mat[0][j]=0;
                    else
                        newCol=0;
                }
            }
        }

        for(int i=1; i<row;i++){
            for(int j=1;j<col;j++){
                if(mat[0][j]==0 || mat[i][0]==0){
                    mat[i][j]=0;
                }
            }
        }

        if(mat[0][0]==0){
            for(int j=0;j<col;j++){
                mat[0][j]=0;
            }
        }
        if(newCol==0){
            for(int i=0;i<row;i++){
                mat[i][0]=0;
            }
        }
    }
}
