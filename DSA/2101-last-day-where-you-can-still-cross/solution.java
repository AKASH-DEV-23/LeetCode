class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int high=cells.length-1;
        int low=0;
        int lastDay=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int[][] matrix= getMatrix(row,col,cells,mid);
            if(isValid(matrix)){
                lastDay=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return lastDay+1;
    }
    private int[][] getMatrix(int row, int col, int[][] cells, int mid){
        int[][] matrix=new int[row][col];
        for(int i=0;i<=mid;i++){
            int[] cordinates=cells[i];
            matrix[cordinates[0]-1][cordinates[1]-1]=1;
        }
        return matrix;
    }
    private boolean isValid(int[][] matrix){
        int col=matrix[0].length;
        for(int i=0;i<col;i++){
            if(DFS(matrix,0,i)) return true;
        }
        return false;
    }
    private boolean DFS(int[][] matrix,int i, int j){
        int row=matrix.length;
        int col=matrix[0].length;
        if(i<0 || j<0 || i>=row || j>=col || matrix[i][j]!=0)  return false;
        matrix[i][j]=1;
        if(i==row-1)  return true;
        if(DFS(matrix,i-1,j)) return true;
        if(DFS(matrix,i+1,j)) return true;
        if(DFS(matrix,i,j-1)) return true;
        if(DFS(matrix,i,j+1)) return true;
        return false;
    }
}
