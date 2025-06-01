class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] row=new int[m];
        int[] col=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(row[i]==1)
                rowZero(matrix,i);
        }
        for(int i=0;i<n;i++){
            if(col[i]==1)
                colZero(matrix,i);
        }
    }
    private void rowZero(int[][] mat, int idx){
        int n=mat[0].length;
        for(int i=0;i<n;i++){
            mat[idx][i]=0;
        }
    }
    private void colZero(int[][] mat, int idx){
        int m=mat.length;
        for(int i=0;i<m;i++){
            mat[i][idx]=0;
        }
    }
}
