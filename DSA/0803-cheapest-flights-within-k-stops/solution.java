class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer,List<int[]>> map=new HashMap<>();
        for(int i=0;i<n;i++)    map.put(i,new ArrayList<>());
        for(int[] graph:flights){
            int u=graph[0];
            int v=graph[1];
            int w=graph[2];
            map.get(u).add(new int[]{v,w});
        }
        // System.out.println(map);
        int[] distance=new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src]=0;
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{src,0});
        int steps=0;
        while(!q.isEmpty() && steps<=k){
            int size=q.size();
            while(size-- >0){
                int[] edge=q.poll();
                int from=edge[0];
                int cost=edge[1];
                for(int[] neighbour:map.get(from)){
                    int to=neighbour[0];
                    int w=neighbour[1];
                    if(distance[to] > cost+w){
                        distance[to]=w+cost;
                        q.offer(new int[]{to,w+cost});
                    }
                }
            }
            steps++;
        }
        System.out.println(Arrays.toString(distance));
        return distance[dst]==Integer.MAX_VALUE ? -1 : distance[dst];
    }
}
