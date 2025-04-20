class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                swap(matrix,i,j);
            }
        }
        for(int[] mat:matrix){
            reverse(mat);
        }
    }

    private void swap(int[][] matrix, int i, int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }

    private void reverse(int[] mat){
        int i=0; 
        int j=mat.length-1;
        while(i<=j){
            int temp=mat[i];
            mat[i]=mat[j];
            mat[j]=temp;
            i++;
            j--;
        }
    }
}
