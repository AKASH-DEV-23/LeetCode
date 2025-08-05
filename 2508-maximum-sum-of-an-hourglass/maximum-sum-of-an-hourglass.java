class Solution {
    public int maxSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                int sum=findSum(grid,i,j);
                ans=Math.max(sum,ans);
            }
        }
        return ans;
    }
    private int findSum(int[][] grid, int i, int j){
        int sum=0;
        for(int idx=0;idx<3;idx++){
            sum+=grid[i][j];
            sum+=grid[i+2][j];
            if(idx==1)  sum+=grid[i+1][j];
            j++;
        }
        System.out.print(sum+" ");
        return sum;
    }
}