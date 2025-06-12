class Solution {
    public int minimumTotal(List<List<Integer>> list) {
        int n=list.size();
        int[][] grid=new int[n][];
        for(int i=0;i<n;i++){
            grid[i]=new int[i+1];
        }
        grid[0][0]=list.get(0).get(0);
        for(int row=1;row<n;row++){
            for(int col=0;col<grid[row].length;col++){
                grid[row][col]=list.get(row).get(col)+findMin(grid,row,col);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int col=0;col<n;col++){
            min=Math.min(min,grid[n-1][col]);
        }
        // System.out.println(Arrays.deepToString(grid));
        return min;
    }
    private int findMin(int[][] grid, int row, int col){
        int min=Integer.MAX_VALUE;
        if(col<grid[row-1].length)
            min=Math.min(min,grid[row-1][col]);
        if(col-1>=0){
            min=Math.min(min,grid[row-1][col-1]);
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}
