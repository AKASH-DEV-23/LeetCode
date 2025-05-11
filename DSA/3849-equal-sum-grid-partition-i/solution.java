class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        long[] hori=new long[row];
        long[] verti=new long[col];
        int h=0;
        int v=0;
        long hsum=0;
        long vsum=0;
        for(int i=0;i<row;i++){
            long sum=0;
            for(int j=0;j<col;j++){
                sum+=grid[i][j];
            }
            hori[h++]=sum;
            hsum+=sum;
        }
        for(int i=0;i<col;i++){
            long sum=0;
            for(int j=0;j<row;j++){
                sum+=grid[j][i];
            }
            verti[v++]=sum;
            vsum+=sum;
        }
        if(hsum%2!=0 && vsum%2!=0)    return false;
        long thsum=hsum/2;
        long tvsum=vsum/2;
        long currsum=0;
        if(hsum%2==0){
            for(int i=0;i<hori.length-1;i++){
                currsum+=hori[i];
                if(currsum==thsum)    return true;
            }
        }
        currsum=0;
        if(vsum%2==0){
            for(int i=0;i<verti.length-1;i++){
                currsum+=verti[i];
                if(currsum==tvsum)    return true;
            }
        }
        return false;
    }
}
