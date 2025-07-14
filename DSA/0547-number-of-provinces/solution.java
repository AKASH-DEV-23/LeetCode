class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V=isConnected.length;
        Map<Integer,List<Integer>> adj=new HashMap<>();
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if( i!=j && isConnected[i][j]==1){
                    if(!adj.containsKey(i)) adj.put(i,new ArrayList<>());
                    adj.get(i).add(j);
                }
            }
        }
        boolean[] visited=new boolean[V];
        int cnt=0;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                DFS(adj,visited,i);
                cnt++;
            }
        } 
        return cnt;
    }
    private void DFS(Map<Integer,List<Integer>> adj, boolean[] visited, int u){
        visited[u]=true;
        for(int v:adj.getOrDefault(u,new ArrayList<>())){
            if(!visited[v]){
                DFS(adj,visited,v);
            }
        }
    }
}
