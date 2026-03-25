class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        long[] rowSum=new long[row];
        long[] colSum=new long[col];
        int idx=0;
        long totalSum=0;
        for(int[] temp:grid){
            long sum=0;
            for(int curr:temp){
                sum+=curr;
            }
            totalSum+=sum;
            rowSum[idx++]=sum;
        }
        if(totalSum%2!=0)   return false;
        idx=0;
        for(int j=0;j<col;j++){
            long sum=0;
            for(int i=0;i<row;i++){
                sum+=grid[i][j];
            }
            colSum[idx++]=sum;
        }
        long sumDiff=totalSum/2;
        for(long currSum:rowSum){
            sumDiff-=currSum;
            if(sumDiff==0)  return true;
            if(sumDiff<0)   break;
        }
        sumDiff=totalSum/2;
        for(long currSum:colSum){
            sumDiff-=currSum;
            if(sumDiff==0)  return true;
            if(sumDiff<0)   break;
        }
        return false;
    }
}
