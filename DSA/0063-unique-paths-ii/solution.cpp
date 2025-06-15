class Solution {
public:
int cnt;
vector<vector<int>>dp;
int solve(vector<vector<int>>&grid,int i,int j){
    if(i>=grid.size()||j>=grid[0].size()||i<0 ||j<0|| grid[i][j]==2 ||grid[i][j]==1){
       return 0;
    }
    if(i==grid.size()-1 && j==grid[0].size()-1) {
        return 1;
    } 
    if(dp[i][j]!=-1) return dp[i][j];
    grid[i][j]=2;
   int f= solve(grid,i+1,j);
   int s= solve(grid,i,j+1);
    grid[i][j]=0;
    return dp[i][j]=f+s;

}
    int uniquePathsWithObstacles(vector<vector<int>>& grid) {
     dp.resize(grid.size(),vector<int>(grid[0].size(),-1));
    return solve(grid,0,0);
    }
};
