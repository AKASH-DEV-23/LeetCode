class Solution {
    boolean[][] isPacific;
    boolean[][] isAtlantic;
    int m;
    int n;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans=new ArrayList<>();
        m=heights.length;
        n=heights[0].length;
        isPacific=new boolean[m][n];
        isAtlantic=new boolean[m][n];
        for(int j=0;j<n;j++){
            dfs(isPacific,0,j,heights);
        }
        for(int i=0;i<m;++i){
            dfs(isPacific,i,0,heights);
        }
        for(int i=0;i<m;i++){
            dfs(isAtlantic,i,n-1,heights);
        }
        for(int i=0;i<n;i++){
            dfs(isAtlantic,m-1,i,heights);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isPacific[i][j] && isAtlantic[i][j]){
                    ans.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }
        return ans;
    }
    private void dfs(boolean[][] isPacific, int i, int j, int[][] grid){
        if(i<0 || i>=m || j<0 || j>=n || isPacific[i][j])  return;
        isPacific[i][j]=true;
        if(i+1<m && grid[i+1][j]>=grid[i][j])
            dfs(isPacific,i+1,j,grid);

        if(i-1>=0 && grid[i-1][j]>=grid[i][j])
            dfs(isPacific,i-1,j,grid);

        if(j+1<n && grid[i][j+1]>=grid[i][j])
            dfs(isPacific,i,j+1,grid);

        if(j-1>=0 && grid[i][j-1]>=grid[i][j])
            dfs(isPacific,i,j-1,grid);
        

    }
}
