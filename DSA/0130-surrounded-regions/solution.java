class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<n;i++){
            if(board[0][i]=='O'){
                DFS(board,0,i);
            }
            if(board[m-1][i]=='O'){
                DFS(board,m-1,i);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                DFS(board,i,0);
            }
            if(board[i][n-1]=='O'){
                DFS(board,i,n-1);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    DFS1(board,i,j);
                }
            }
        }
        System.out.println(Arrays.deepToString(board));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='Y')    board[i][j]='O';
            }
        }
    }
    private void DFS(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='O')    return;
        grid[i][j]='Y';
        DFS(grid,i-1,j);
        DFS(grid,i+1,j);
        DFS(grid,i,j-1);
        DFS(grid,i,j+1);
    }
    private void DFS1(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='O')    return;
        grid[i][j]='X';
        DFS1(grid,i-1,j);
        DFS1(grid,i+1,j);
        DFS1(grid,i,j-1);
        DFS1(grid,i,j+1);
    }
}
