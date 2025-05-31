class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int col=0;col<n;col++){
            if(board[0][col]=='O'){
                DFS(board,0,col);
            }
            if(board[m-1][col]=='O'){
                DFS(board,m-1,col);
            }
        }
        for(int row=0;row<m;row++){
            if(board[row][0]=='O'){
                DFS(board,row,0);
            }
            if(board[row][n-1]=='O'){
                DFS(board,row,n-1);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O')    board[i][j]='X';
                if(board[i][j]=='A')    board[i][j]='O';
            }
        }
    }
    private void DFS(char[][] grid, int i, int j){
        if(!isSafe(grid,i,j)){
            return;
        }
        if(grid[i][j]=='X' || grid[i][j]=='A')    return;
        grid[i][j]='A';
        DFS(grid,i-1,j);
        DFS(grid,i+1,j);
        DFS(grid,i,j-1);
        DFS(grid,i,j+1);
    }
    private boolean isSafe(char[][] grid, int i, int j){
        int m=grid.length;
        int n=grid[0].length;
        return i>=0 && i<m && j>=0 && j<n;
    }
}
