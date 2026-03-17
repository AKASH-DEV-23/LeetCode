class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int col=matrix[0].length;
        int row=matrix.length;

        for(int j=0;j<col;j++){
            for(int i=1;i<row;i++){
                if(matrix[i][j]!=0){
                    matrix[i][j]=matrix[i-1][j]+1;
                }
            }
        }
        
        for(int[] temp:matrix){
            Arrays.sort(temp);
        }

        // System.out.println(Arrays.deepToString(matrix));

        int ans=-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans=Math.max(ans,matrix[i][j]*(col-j));
            }
        }
        return ans;
    }
}
