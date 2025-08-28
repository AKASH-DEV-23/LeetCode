class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=1;i<n;i++){
            reverse(grid,0,i);
        }
        for(int i=0;i<m;i++){
            reverse(grid,i,0);
        }
        return grid;
    }
    private void reverse(int[][] grid, int i, int j){
        int m=grid.length;
        int n=grid[0].length;
        int x=i;
        int y=j;
        List<Integer> temp=new ArrayList<>();
        while(i<m && j<n){
            temp.add(grid[i][j]);
            i++;
            j++;
        }
        if(x-y<0)   Collections.sort(temp);
        else {
            Collections.sort(temp);
            Collections.reverse(temp);
        }   
        i=x;
        j=y;
        int idx=0;
        while(i<m && j<n){
            grid[i][j]=temp.get(idx);
            i++;
            j++;
            idx++;
        }
    }
}