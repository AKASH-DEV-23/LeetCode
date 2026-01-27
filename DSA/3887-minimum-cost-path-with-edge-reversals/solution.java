// class Solution {
//     public int minCost(int n, int[][] edges) {
//         Map<Integer,Map<Integer,Integer>> adj=new HashMap<>();

//         for(int[] edge:edges){
//             int u=edge[0];
//             int v=edge[1];
//             int w=edge[2];
//             if(!adj.containsKey(u)){
//                 adj.put(u,new HashMap<>());
//             }
//             Map<Integer,Integer> inside=adj.get(u);
//             if(inside.containsKey(v)){
//                 inside.put(v,Math.min(inside.get(v),w));
//             }else{
//                 inside.put(v,w);
//             }

//             int newU=v;
//             int newV=u;
//             int newW=2*w;
//             if(!adj.containsKey(newU)){
//                 adj.put(newU,new HashMap<>());
//             }
//             Map<Integer,Integer> inside1=adj.get(newU);
//             if(inside1.containsKey(newV)){
//                 inside1.put(newV,Math.min(inside1.get(newV),newW));
//             }else{
//                 inside1.put(newV,newW);
//             }
//         }

//         System.out.print("adj "+adj);
//         Set<Integer> vis=new HashSet<>();
//         int[] dis=new int[n];
//         Arrays.fill(dis,Integer.MAX_VALUE);
//         dis[0]=0;
//         for(int i=0;i<n;i++){
//             if(!vis.contains(i)){
//                 helper(adj,i,vis,dis);
//             }
//         }

//         System.out.println(Arrays.toString(dis));
//         return dis[n-1]==Integer.MAX_VALUE ? -1 : dis[n-1];
//     }

//     private void helper(Map<Integer,Map<Integer,Integer>> adj, int u, Set<Integer> vis, int[] dis){
//         if(vis.contains(u)){
//             return;
//         }
//         if(dis[u]==Integer.MAX_VALUE)   return;
//         vis.add(u);
//         if(!adj.containsKey(u)) return;
//         for(Map.Entry<Integer,Integer> edge:adj.get(u).entrySet()){
//                 int v=edge.getKey();
//                 int w=edge.getValue();
//                 int newV=dis[u]+w;
//                 if(dis[v]>newV){
//                     dis[v]=newV;
//                     helper(adj,v,vis,dis);
//                 }
//         }
//     }
// }

class Solution {
    public int minCost(int n, int[][] edges) {

        Map<Integer, List<int[]>> adj = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            adj.computeIfAbsent(u, k -> new ArrayList<>())
               .add(new int[]{v, w});

            adj.computeIfAbsent(v, k -> new ArrayList<>())
               .add(new int[]{u, 2 * w});
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        pq.offer(new int[]{0, 0});

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();
            int node = curr[0];
            int currDist = curr[1];

            if (currDist > dist[node]) continue;

            if (!adj.containsKey(node)) continue;

            for (int[] neighbor : adj.get(node)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];

                if (dist[nextNode] > dist[node] + weight) {
                    dist[nextNode] = dist[node] + weight;
                    pq.offer(new int[]{nextNode, dist[nextNode]});
                }
            }
        }

        return dist[n - 1] == Integer.MAX_VALUE ? -1 : dist[n - 1];
    }
}

