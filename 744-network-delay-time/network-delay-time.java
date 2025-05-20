class Pair{
    int vertex;
    int weight;
    public Pair(int vertex, int weight){
        this.vertex=vertex;
        this.weight=weight;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<Pair>> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int edge[] : times){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            map.get(u).add(new Pair(v,w));
        }
        Comparator<Pair> com=new Comparator<>(){
            public int compare(Pair p1, Pair p2){
                if(p1.weight<p2.weight)     return -1;
                else if(p1.weight>p2.weight)    return 1;
                else    return 0;
            }
        };

        PriorityQueue<Pair> pq=new PriorityQueue<>(com);
        int distance[]=new int[n+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[k]=0;
        pq.offer(new Pair(k,0));

        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int u=curr.vertex;
            int w=curr.weight;
            for(Pair neighbour:map.getOrDefault(u,new ArrayList<>())){
                int v=neighbour.vertex;
                int cost=neighbour.weight;
                if((w+cost)<distance[v]){
                    distance[v]=w+cost;
                    pq.offer(new Pair(v,w+cost));
                }
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<distance.length;i++){
            ans=Math.max(ans,distance[i]);
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}