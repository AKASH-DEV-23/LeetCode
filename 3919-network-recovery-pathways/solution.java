class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        Map<Integer,List<int[]>> adj=new HashMap<>();
        
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            if(!adj.containsKey(u))  adj.put(u,new ArrayList<>());
            adj.get(u).add(new int[]{v,w});
        }
     PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[2], a[2]));
        pq.offer(new int[]{0,0,Integer.MAX_VALUE});
        int len=edges.length;
        int[] arr=new int[len];
        Arrays.fill(arr,Integer.MAX_VALUE);
        
        int res=Integer.MAX_VALUE;
        while(!pq.isEmpty()){
            int[] edge=pq.poll();
            int u=edge[0];
            int w=edge[1];
            int oldw=edge[2];
            if(u==online.length-1) {
                if(w<=k) return oldw;
                else continue;
            }
            if(online[u]){
            for(int[] neigh:adj.getOrDefault(u,new ArrayList<>())){
                int nod=neigh[0];
                int wei=neigh[1];
                if(online[nod] && w+wei<=k){
                    int mini=Math.min(wei,oldw);
                    pq.offer(new int[]{nod,w+wei,mini});
                }
            }
            }
        }
        return -1;
    }
}
