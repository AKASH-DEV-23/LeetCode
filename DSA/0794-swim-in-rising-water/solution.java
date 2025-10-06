class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        boolean[][] visited=new boolean[n][n];
        int maxHeight=0;
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[0]<b[0])   return -1;
                else if(a[0]>b[0])  return 1;
                else    return 0;
            }
        };
        PriorityQueue<int[]> pq=new PriorityQueue<>(com);
        int[][] directions=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        pq.offer(new int[]{grid[0][0],0,0});
        visited[0][0]=true;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            maxHeight=Math.max(maxHeight,curr[0]);
            int x=curr[1];
            int y=curr[2];
            if(x==n-1 && y==n-1)  return maxHeight;
            for(int[] dir:directions){
                int newX=x+dir[0];
                int newY=y+dir[1];
                if(newX>=0 && newX<n && newY>=0 && newY<n && !visited[newX][newY]){
                  pq.offer(new int[]{grid[newX][newY],newX,newY});
                  visited[newX][newY]=true;
                }
            }

        }
        return -1;
    }
}
