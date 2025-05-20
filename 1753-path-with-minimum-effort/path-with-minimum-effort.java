class Pair{
    int cost;
    int xAxis;
    int yAxis;
    public Pair(int cost, int xAxis, int yAxis){
        this.cost=cost;
        this.xAxis=xAxis;
        this.yAxis=yAxis;
    }
}

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int row=heights.length;
        int col=heights[0].length;
        int[][] distance=new int[row][col];
        for(int[] dis:distance){
            Arrays.fill(dis,Integer.MAX_VALUE);
        }
        distance[0][0]=0;
        Comparator<Pair> com=new Comparator<>(){
            public int compare(Pair p1, Pair p2){
                if(p1.cost<p2.cost)     return -1;
                else if(p1.cost > p2.cost)      return 1;
                else    return 0;
            }
        };
        int[][] allDir=new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        PriorityQueue<Pair> pq=new PriorityQueue<>(com);
        pq.offer(new Pair(0,0,0));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int diff=curr.cost;
            int x=curr.xAxis;
            int y=curr.yAxis;
            for(int[] dir:allDir){
                int newX=x+dir[0];
                int newY=y+dir[1];
                if(isSafe(newX, newY,row,col)){
                    int newDiff=Math.abs(heights[x][y]-heights[newX][newY]);
                    int maxDiff=Math.max(diff,newDiff);
                    if(maxDiff<distance[newX][newY]){
                        distance[newX][newY]=maxDiff;
                        pq.offer(new Pair(maxDiff,newX,newY));
                    }
                }
            }
        }
        return distance[row-1][col-1];
    }
    private boolean isSafe(int x, int y, int row, int col){
        return x>=0 && x<row && y>=0 && y<col;
    }
}