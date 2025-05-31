class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                }else{
                    mat[i][j]=-1;
                }
            }
        }
        int[][] directions=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            int k=q.size();
            for(int a=0;a<k;a++){
                int[] cordi=q.poll();
                int x=cordi[0];
                int y=cordi[1];
                for(int[] dir:directions){
                    int newX=x+dir[0];
                    int newY=y+dir[1];
                    if(isSafe(mat,newX,newY) && mat[newX][newY]==-1){
                        mat[newX][newY]=mat[x][y]+1;
                        q.offer(new int[]{newX,newY});
                    }
                }
            }
        }
        return mat;
    }
    private boolean isSafe(int[][] grid,int i, int j){
        int m=grid.length;
        int n=grid[0].length;
        return i>=0 && i<m && j>=0 && j<n;
    }
}




    //  TLE
// class Solution {
//     public int[][] updateMatrix(int[][] mat) {
//         int m=mat.length;
//         int n=mat[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(mat[i][j]==1){
//                     BFS(mat,i,j);
//                 }
//             }
//         }
//         return mat;
//     }
//     private void BFS(int[][] grid,int i, int j){
//         int cnt=0;
//         Queue<int[]> q=new LinkedList<>();
//         q.offer(new int[]{i,j});
//         int[][] directions=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
//         while(!q.isEmpty()){
//             int k=q.size();
//             cnt++;
//             for(int a=0;a<k;a++){
//                 int[] cordi=q.poll();
//                 int x=cordi[0];
//                 int y=cordi[1];
//                 for(int[] dir:directions){
//                     int newX=x+dir[0];
//                     int newY=y+dir[1];
//                     if(isSafe(grid,newX,newY) && grid[newX][newY]==0){
//                         grid[i][j]=cnt;
//                         return;
//                     }else if(isSafe(grid,newX,newY)){
//                         q.offer(new int[]{newX,newY});
//                     }
//                 }
//             }
//         }
//     }
//     private boolean isSafe(int[][] grid,int i, int j){
//         int m=grid.length;
//         int n=grid[0].length;
//         return i>=0 && i<m && j>=0 && j<n;
//     }
// }
