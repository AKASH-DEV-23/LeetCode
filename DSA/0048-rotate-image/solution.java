class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=m;

        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<m;i++){
            reverse(matrix[i]);
        }
    }

    private static void reverse(int matrix[]){
        int i=0;
        int j=matrix.length-1;
        while(i<=j){
            int temp =matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
        }

    }
}
