class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> vis=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')    continue;
                char ch=board[i][j];
                if(!vis.add(ch+"found on i"+i) || 
                !vis.add(ch+"found on j"+j) || 
                !vis.add(ch+"found on"+ i/3+"-"+j/3))  return false;
            }
        }
        return true;
    }
}
