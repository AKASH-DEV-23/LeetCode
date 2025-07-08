class Solution {
    public int swimInWater(int[][] grid) {
        return Dijkstra(grid);
    }
    private int Dijkstra(int[][] grid){
        int row=grid.length;
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[0]<b[0])   return -1;
                else if(a[0]>b[0])  return 1;
                else return 0;
            }
        };
        PriorityQueue<int[]> minPq=new PriorityQueue<>(com);
        int[][] directions={{0,-1},{0,1},{-1,0},{1,0}};
        minPq.offer(new int[]{grid[0][0],0,0});
        int maxElevation=grid[0][0];
        grid[0][0]=-1;
        while(!minPq.isEmpty()){
            int[] edge=minPq.poll();
            maxElevation=Math.max(maxElevation,edge[0]);
            if(edge[1]==row-1 && edge[2]==row-1)    return maxElevation;
            for(int[] dir:directions){
                int newX=edge[1]+dir[0];
                int newY=edge[2]+dir[1];
                if(newX>=0 && newX<row && newY>=0 && newY<row && 
                grid[newX][newY]!=-1){
                    minPq.offer(new int[]{grid[newX][newY],newX,newY});
                    grid[newX][newY]=-1;
                }
            }
        }
        return maxElevation;
    }
}
