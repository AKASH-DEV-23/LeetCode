class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int row=grid.length;
        int col=grid[0].length;
        int rowi=row-k+1;
        int colj=col-k+1;
        int[][] ans=new int[rowi][colj];
        int idxi=0;
        int idxj=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i+k>row || j+k>col)    continue;
                int minVal=findMinDiff(grid,i,j,k);
                ans[idxi][idxj++]=minVal;
                if(idxj==colj){
                    idxi++;
                    idxj=0;
                }
            }
        }

        return ans;
    }

    private int findMinDiff(int[][] grid, int i, int j, int k){
        List<Integer> list=new ArrayList<>();
        for(int m=i;m<i+k;m++){
            for(int n=j;n<j+k;n++){
                list.add(grid[m][n]);
            }
        }

        Collections.sort(list);
        int minVal=Integer.MAX_VALUE;
        for(i=1;i<list.size();i++){
            int prev=list.get(i-1);
            int curr=list.get(i);
            if(prev!=curr){
                minVal=Math.min(minVal,Math.abs(curr-prev));
            }
        }
        return minVal==Integer.MAX_VALUE ? 0 : minVal;
    }
}
