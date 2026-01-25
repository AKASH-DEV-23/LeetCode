// class Solution {
//     public int specialNodes(int n, int[][] edges, int x, int y, int z) {
//         Map<Integer,List<Integer>> adj=new HashMap<>();
        
//         for(int[] edge:edges){
//             int u=edge[0];
//             int v=edge[1];
//             if(!adj.containsKey(u))  adj.put(u,new ArrayList<>());
//             if(!adj.containsKey(v))  adj.put(v,new ArrayList<>());
//             adj.get(u).add(v);
//             adj.get(v).add(u);
//         }

//         int ans=0;
//         for(int u=0;u<n;u++){
//             if(BFS(adj,u,x,y,z)) ans++;
//         }
//         return ans;
        
//     }

//     private boolean BFS(Map<Integer,List<Integer>> adj, int u, int x, int y, int z){
//         Set<Integer> target=new HashSet<>();
//         Set<Integer> vis=new HashSet<>();
//         int disX=0;
//         int disY=0;
//         int disZ=0;
//         if(u==x){
//             target.add(x);
//         }else if(u==y){
//             target.add(y);
//         }else if(u==z){
//             target.add(z);
//         }
//         Queue<Integer> q=new LinkedList<>();
//         q.offer(u);
//         vis.add(u);
//         int dis=0;
//         while(!q.isEmpty()){
//             int n=q.size();
//             for(int i=0;i<n;i++){
//                 int org=q.poll();
//                 if(!target.contains(org) && org==x){
//                     target.add(x);
//                     disX=dis;
//                 }else if(!target.contains(org) && org==y){
//                     target.add(y);
//                     disY=dis;
//                 }else if(!target.contains(org) && org==z){
//                     target.add(z);
//                     disZ=dis;
//                 }
//                 for(int v:adj.getOrDefault(org,new ArrayList<>())){
//                     if(!vis.contains(v)){
//                         q.offer(v);
//                         vis.add(v);
//                     }
//                 }
//             }
//             if(target.size()==3){
//                 break;
//             }
//             dis++;
//         }
//         if(target.size()!=3)  return false;
//         int[] nums={disX,disY,disZ};
//         Arrays.sort(nums);
//         if(((nums[0]*nums[0]) + (nums[1]*nums[1])) == nums[2]*nums[2]){
//             return true;
//         }
//         return false;
//     }
// }


class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        Map<Integer,List<Integer>> adj=new HashMap<>();
        
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            if(!adj.containsKey(u))  adj.put(u,new ArrayList<>());
            if(!adj.containsKey(v))  adj.put(v,new ArrayList<>());
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] distX = BFS_ALL(adj, x, n);
        int[] distY = BFS_ALL(adj, y, n);
        int[] distZ = BFS_ALL(adj, z, n);
        
        int ans=0;
        for(int u=0;u<n;u++){
            if(distX[u] != -1 && distY[u] != -1 && distZ[u] != -1) {
                int[] nums={distX[u], distY[u], distZ[u]};
                Arrays.sort(nums);
                if(((nums[0]*nums[0]) + (nums[1]*nums[1])) == nums[2]*nums[2]){
                    ans++;
                }
            }
        }
        return ans;
    }
    
    private int[] BFS_ALL(Map<Integer,List<Integer>> adj, int start, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        dist[start] = 0;
        
        while(!q.isEmpty()){
            int org = q.poll();
            for(int v:adj.getOrDefault(org,new ArrayList<>())){
                if(dist[v] == -1){
                    dist[v] = dist[org] + 1;
                    q.offer(v);
                }
            }
        }
        return dist;
    }
    
    private boolean BFS(Map<Integer,List<Integer>> adj, int u, int x, int y, int z){
        return false;
    }
}
