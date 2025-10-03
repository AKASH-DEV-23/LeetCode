class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m=heightMap.length;
        int n=heightMap[0].length;
        boolean[][] vis=new boolean[m][n];
        // Comparator<int[]> com=new Comparator<>(){
        //     public int compare(int[] a, int[] b){
        //         if(a[0]<b[0])   return -1;
        //         else if(a[0]>b[0])  return 1;
        //         else    return 0;
        //     }
        // };
        PriorityQueue<int[]> pq=new PriorityQueue<>((int[] a, int[] b)->{
                if(a[0]<b[0])   return -1;
                else if(a[0]>b[0])  return 1;
                else    return 0;
        }); 
        for(int i=0;i<m;i++){
            pq.offer(new int[]{heightMap[i][0],i,0});
            pq.offer(new int[]{heightMap[i][n-1],i,n-1});
            vis[i][0]=true;
            vis[i][n-1]=true;
        }
        for(int i=0;i<n;i++){
            pq.offer(new int[]{heightMap[0][i],0,i});
            pq.offer(new int[]{heightMap[m-1][i],m-1,i});
            vis[0][i]=true;
            vis[m-1][i]=true;
        }
        int water=0;
        int[][] directions=new int[][]{{0,-1},{-1,0},{0,1},{1,0}};
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            int prevHeight=temp[0];
            int i=temp[1];
            int j=temp[2];
            for(int[] dir:directions){
                int x=dir[0]+i;
                int y=dir[1]+j;
                if(x>=0 && x<m && y>=0 && y<n && !vis[x][y]){
                    water+=Math.max(prevHeight-heightMap[x][y],0);
                    vis[x][y]=true;
                    pq.offer(new int[]{Math.max(heightMap[x][y],
                    prevHeight),x,y});
                }
            }
        }
        return water;
    }
}