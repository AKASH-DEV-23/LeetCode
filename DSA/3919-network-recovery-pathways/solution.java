class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        Map<Integer,List<int[]>> adj=new HashMap<>();
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            if(!adj.containsKey(u)) adj.put(u,new ArrayList<>());
            adj.get(u).add(new int[]{v,w});
        }
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a, int[] b){
                if(a[2]<b[2])   return 1;
                else if(a[2]>b[2])  return -1;
                else return 0;
            }
        };
        PriorityQueue<int[]> pq=new PriorityQueue<>(com);
        pq.offer(new int[]{0,0,Integer.MAX_VALUE});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int u=curr[0];
            int w=curr[1];
            int min=curr[2];
            if(u==online.length-1){
                if(w<=k)    return min;
            }
            for(int[] nei:adj.getOrDefault(u,new ArrayList<>())){
                int v=nei[0];
                int neww=nei[1];
                if(online[v] && w+neww<=k){
                    int minedge=Math.min(min,neww);
                    pq.offer(new int[]{v,w+neww,minedge});
                }
            }
        }
        return -1;
    }
}
