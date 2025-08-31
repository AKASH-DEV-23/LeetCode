class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(board,i,j,c)){  //CHECK VALIDITY
                            board[i][j]=c;          // DO
                            if(solve(board))  return true; //EXPLORE
                            board[i][j]='.';  //UNDO
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(char[][] grid, int row, int col,char ch){
        for(int i=0;i<9;i++)    if(grid[row][i]==ch)    return false;
        for(int i=0;i<9;i++)    if(grid[i][col]==ch)    return false;
        int rowBox=3*(row/3);
        int colBox=3*(col/3);
        for(int i=0;i<3;i++)    for(int j=0;j<3;j++)    if(grid[rowBox+i][colBox+j]==ch)    return false;
        return true;
    }
}