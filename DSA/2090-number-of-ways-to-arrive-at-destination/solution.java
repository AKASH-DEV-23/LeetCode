class Solution {
    static final int MOD=1000000007;
    public int countPaths(int n, int[][] roads) {
        Map<Integer,List<int[]>> adjList=new HashMap<>();
        for(int i=0;i<n;i++){
            adjList.put(i,new ArrayList<>());
        }
        for(int[] edge:roads){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            adjList.get(u).add(new int[]{v,w});
            adjList.get(v).add(new int[]{u,w});
        }
        Comparator<long[]> com=new Comparator<>(){
            public int compare(long[] a, long[] b){
                if(a[1]<b[1])   return -1;
                else if(a[1]>b[1])  return 1;
                else    return 0;
            }
        };
        PriorityQueue<long[]> minpq=new PriorityQueue<>(com);
        minpq.offer(new long[]{0,0});
        long[] dist=new long[n];
        long[] ways=new long[n];
        ways[0]=1;
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0]=0;
        while(!minpq.isEmpty()){
            long[] curr=minpq.poll();
            int u=(int)curr[0];
            long oldw=curr[1];
            for(int[] neigh:adjList.get(u)){
                int v=neigh[0];
                int weight=neigh[1];
                if(oldw>dist[v])    continue;
                if(oldw+weight==dist[v])    
                    ways[v]=(ways[v]+ways[u])%MOD;
                else if(dist[v]>oldw+weight){
                    dist[v]=oldw+weight;
                    minpq.offer(new long[]{v,dist[v]});
                    ways[v]=ways[u];
                }
            }
        }
        return (int)ways[n-1];
    }
}
