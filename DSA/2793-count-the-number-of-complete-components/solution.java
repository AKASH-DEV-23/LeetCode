class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> adj=new HashMap<>();
        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];
            if(!adj.containsKey(u)){
                adj.put(u,new ArrayList<>());
            }
            if(!adj.containsKey(v)){
                adj.put(v,new ArrayList<>());
            }
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int component=0;
        boolean[] visited = new boolean[n];
        for(int node=0; node<n; node++){
            if(visited[node])  continue;
            int[] info=new int[2];
            bfs(node, adj,visited,info);
            if(info[0]*(info[0]-1)==info[1]){
                component++;
            }
        }
        return component;
    }

    private void dfs(int node, Map<Integer, List<Integer>> adj, boolean[] visited, int[] info){
        visited[node]=true;
        info[0]++;
        info[1]+=adj.getOrDefault(node,new ArrayList<>()).size();
        for(int ngbr: adj.getOrDefault(node, new ArrayList<>())){
            if(!visited[ngbr]){
                dfs(ngbr,adj,visited,info);
            }
        }
    }

    private void bfs(int node, Map<Integer, List<Integer>> adj, boolean[] visited, int[] info){
        Queue<Integer> q=new LinkedList<>();
        q.offer(node);
        visited[node]=true;
        while(!q.isEmpty()){
            int vertex=q.poll();
            info[0]++;
            info[1] += adj.getOrDefault(vertex, new ArrayList<>()).size();
            for(int ngbr:adj.getOrDefault(vertex,new ArrayList<>())){
                if(!visited[ngbr]){
                    q.offer(ngbr);
                    visited[ngbr]=true;
                }
            }
        }
    }
}
