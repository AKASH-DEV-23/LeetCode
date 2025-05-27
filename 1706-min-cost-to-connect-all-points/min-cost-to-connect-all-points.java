class Solution {
    public int minCostConnectPoints(int[][] points) {
        Map<Integer,List<int[]>> map=new HashMap<>();
        int V=points.length;
        for(int i=0;i<V;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<V;i++){
            for(int j=i+1;j<V;j++){
                int w = Math.abs(points[i][0]-points[j][0]) + 
                        Math.abs(points[i][1] - points[j][1]);
                map.get(i).add(new int[]{j,w});
                map.get(j).add(new int[]{i,w});
            }
        }
        return Prims(map,V);
    }
    private int Prims(Map<Integer,List<int[]>> map, int V){
        boolean[] visited=new boolean[V];
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[1]<b[1])   return -1;
                else if(a[1]>b[1])  return 1;
                else return 0;
            }
        };
        PriorityQueue<int[]> pq=new PriorityQueue<>(com);
        pq.offer(new int[]{0,0});
        int cost=0;
        int cnt=0;
        while(!pq.isEmpty()){
            int[] edge=pq.poll();
            int u=edge[0];
            int w=edge[1];
            if(visited[u])  continue;
            cost+=w;
            // cnt++;
            visited[u]=true;
            for(int[] graph:map.get(u)){
                if(!visited[graph[0]]){
                    pq.offer(graph);
                }
            }
        }
        return cost;
    }
}