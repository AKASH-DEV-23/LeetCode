class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int cnt=0;
        for(int i=0;i<=row-3;i++){
            for(int j=0;j<=col-3;j++){
                if(solve(i,j,grid)) cnt++;
            }
        }
        return cnt;
    }
    private boolean solve(int i, int j, int[][] grid){
        int row=grid.length;
        int col=grid[0].length;
        int rowSum1=grid[i][j]+grid[i][j+1]+grid[i][j+2];
        int rowSum2=grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2];
        int rowSum3=grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
        int colSum1=grid[i][j]+grid[i+1][j]+grid[i+2][j];
        int colSum2=grid[i][j+1]+grid[i+1][j+1]+grid[i+2][j+1];
        int colSum3=grid[i][j+2]+grid[i+1][j+2]+grid[i+2][j+2];
        int diaSum1=grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
        int diaSum2=grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j];
        int[] freq=new int[10];
        for(int x=i;x<=i+2;x++){
            for(int y=j;y<=j+2;y++){
                if(grid[x][y]>9 || grid[x][y]==0)    return false;
                freq[grid[x][y]]++;
                if(freq[grid[x][y]]>1)  return false;
            }
        }
        for(int idx=1;idx<=9;idx++){
            if(freq[idx]!=1)    return false;
        }
        Set<Integer> vis = new HashSet<>();
        vis.add(rowSum1);
        vis.add(rowSum2);
        vis.add(rowSum3);
        vis.add(colSum1);
        vis.add(colSum2);
        vis.add(colSum3);
        vis.add(diaSum1);
        vis.add(diaSum2);
        if(vis.size()==1)   return true;
    return false;
    }
}
