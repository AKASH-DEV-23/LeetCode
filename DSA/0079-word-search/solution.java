class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;

        boolean[][] visited=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0) && checkWordInFourDirection(board,i,j,word,1,visited))   return true;
            }
        }

        return false;
    }

    private final int[] dirX={-1,1,0,0};
    private final int[] dirY={0,0,-1,1};

    private boolean checkWordInFourDirection(char[][] board, int i, int j, String word, int index, boolean[][] visited){
        if(index==word.length())    return true;
        visited[i][j]=true;

        for(int cor=0;cor<4;cor++){
            int currX=i+dirX[cor];
            int currY=j+dirY[cor];
            if(currX<0 || currX==board.length || currY<0 || currY==board[0].length)  continue;
            if(visited[currX][currY] || board[currX][currY]!=word.charAt(index))  continue;
            if(checkWordInFourDirection(board,currX,currY,word,index+1,visited)) return true;
        }
        visited[i][j]=false;
        return false;
    }
}
