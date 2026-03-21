class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int row=grid.length;
        int col=grid[0].length;

        int rowSt=x;
        int rowEnd=x+k-1;
        int colSt=y;
        int colEnd=y+k-1;

        while(rowSt<rowEnd){
            for(int i=colSt;i<=colEnd;i++){
                int temp=grid[rowSt][i];
                grid[rowSt][i]=grid[rowEnd][i];
                grid[rowEnd][i]=temp;
            }
            rowSt++;
            rowEnd--;
        }

        return grid;
    }
}
