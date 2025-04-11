class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,ArrayList<Integer>> adj=new HashMap<>();
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            if(!adj.containsKey(u))
                adj.put(u,new ArrayList<>());
            if(!adj.containsKey(v))
                adj.put(v,new ArrayList<>());
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited=new boolean[n];

        // return bfs(adj,visited,source,destination);
        return dfs(adj,visited,source,destination);
    }

    private boolean dfs(Map<Integer,ArrayList<Integer>> adj, boolean[] visited, 
    int source, int destination){
        if(source==destination) return true;
        if(visited[source]) return false;
        visited[source]=true;
        for(int vertex:adj.get(source)){
            if(dfs(adj,visited,vertex,destination)) return true;
        }
        return false;
    }

    private boolean bfs(Map<Integer,ArrayList<Integer>> adj, boolean[] visited, 
    int source, int destination){
        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        visited[source]=true;
        while(!q.isEmpty()){
            int vertex =q.poll();
            if(vertex==destination) return true;
            for(int node : adj.get(vertex)){
                if(!visited[node]){
                    q.offer(node);
                    visited[node]=true;
                }
            }
        }
        return false;
    }
}