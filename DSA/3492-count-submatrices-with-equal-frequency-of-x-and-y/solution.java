class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int [][]y_matrix = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            int count = 0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='Y'){
                    count++;
                }
                y_matrix[i][j] = count;
            }
        }
        for(int i=0;i<grid[0].length;i++){
            int count = 0;
            for(int j=0;j<grid.length;j++){
                count+=y_matrix[j][i];
                y_matrix[j][i] = count;
            }
        }
        
        
        int [][]x_matrix = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            int count = 0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='X'){
                    count++;
                }
                x_matrix[i][j] = count;
            }
        }
        for(int i=0;i<grid[0].length;i++){
            int count = 0;
            for(int j=0;j<grid.length;j++){
                count+=x_matrix[j][i];
                x_matrix[j][i] = count;
            }
        }
        
        int answer = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(x_matrix[i][j]>0 && x_matrix[i][j]==y_matrix[i][j]){
                    answer++;
                }
            }
        }
        return answer;
    }
}
