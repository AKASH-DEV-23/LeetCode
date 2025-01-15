class Solution {
    public void rotate(int[][] mat) {
        int row=mat.length;

        for(int i=0;i<row;i++){
            for(int j=i+1;j<row;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int i=0;i<row;i++){
            reverse(mat[i]);
        }
    }

    private void reverse(int[] mat){
        int i=0;
        int j=mat.length-1;
        while(i<j){
            int temp=mat[i];
            mat[i]=mat[j];
            mat[j]=temp;
            i++;
            j--;
        }
    }
}
