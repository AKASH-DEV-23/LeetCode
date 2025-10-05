class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> vis=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.') continue;
                if(!vis.add(ch+"in row"+i)) return false;
                if(!vis.add(ch+"in col"+j)) return false; 
                if(!vis.add(ch+"in box"+i/3+"-"+j/3)) return false;
            }
        }
        return true;
    }
}
