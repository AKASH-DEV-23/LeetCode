class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row=grid.length;
        int[] rowMax=new int[row];
        int[] colMax=new int[row];
        int r=0;
        for(int i=0;i<row;i++){
            int maxi=-1;
            for(int j=0;j<row;j++){
                maxi=Math.max(maxi,grid[i][j]);
            }
            rowMax[r++]=maxi;
        }
        r=0;
        for(int i=0;i<row;i++){
            int maxi=-1;
            for(int j=0;j<row;j++){
                maxi=Math.max(maxi,grid[j][i]);
            }
            colMax[r++]=maxi;
        }
        // System.out.println(Arrays.toString(rowMax));
        // System.out.println(Arrays.toString(colMax));
        int sum=0;
        for(int i=0;i<row;i++){
            int rmax=rowMax[i];
            for(int j=0;j<row;j++){
                int mini=Math.min(rmax,colMax[j]);
                System.out.print(mini+" ");
                sum+=Math.abs(grid[i][j]-mini);
            }
        }
        return sum;
    }
}
