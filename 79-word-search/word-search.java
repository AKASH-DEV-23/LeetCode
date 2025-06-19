class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0) && solve(board,word,i,j,0))    return true;

            }
        }
        return false;
    }
    private boolean solve(char[][] board, String word, int i, int j, int idx){
        if(idx>=word.length())    return true;
        if(i<0 || i>=board.length || j<0 || j>=board[i].length || 
        board[i][j]!=word.charAt(idx) || board[i][j]=='*')    return false;
        char temp=board[i][j];
        board[i][j]='*';
        if(solve(board,word,i+1,j,idx+1))  return true;
        if(solve(board,word,i-1,j,idx+1))  return true;
        if(solve(board,word,i,j+1,idx+1))  return true;
        if(solve(board,word,i,j-1,idx+1))   return true;
        board[i][j]=temp;
        return false;
    }
}