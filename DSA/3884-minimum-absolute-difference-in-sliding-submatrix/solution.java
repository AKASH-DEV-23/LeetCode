class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int col=grid[0].length;
        int row=grid.length;
        if(k>row || k>col)  return new int[0][0];
        if(row==0)  return new int[0][0];
        int[][] ans=new int[row-k+1][col-k+1];
        for(int i=0;i<row-k+1;i++){
            for(int j=0;j<col-k+1;j++){
                List<Integer> list=helper(grid,i,j,k);
                ans[i][j]=findMin(list);
            }
        }
        return ans;
    } 
    private List<Integer> helper(int[][] nums, int row, int col, int k){
        List<Integer> list=new ArrayList<>();
        for(int i=row;i<row+k;i++){
            for(int j=col;j<col+k;j++){
                list.add(nums[i][j]);
            }
        }
        return list;
    }
    private int findMin(List<Integer> list){
        Collections.sort(list);
        if(list.isEmpty())  return 0;
        if(list.size()<2)  return 0;
        int mini=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            int p=list.get(i-1);
            int c=list.get(i);
            if(c!=p){
                mini=Math.min(mini,c-p);
            }
        }
        return mini==Integer.MAX_VALUE ? 0:mini;
    } 
}
