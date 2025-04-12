class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        Map<Integer, ArrayList<Integer>> adj=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    if(!adj.containsKey(i+1))   adj.put(i+1,new ArrayList<Integer>());
                    adj.get(i+1).add(j+1);
                }
            }
        }
        int cnt=0;
        boolean[] visited=new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                dfs(adj,i,visited);
                cnt++;
            }
        }
        return cnt;
    }

    private void dfs(Map<Integer, ArrayList<Integer>> adj, int vertex, boolean[] visited){
        if(visited[vertex]) return;
        visited[vertex]=true;
        for(int node:adj.get(vertex)){
            if(!visited[node])  dfs(adj,node,visited);
        }
    }
}