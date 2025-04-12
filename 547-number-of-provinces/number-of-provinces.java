class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        Map<Integer, ArrayList<Integer>> adj=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    if(!adj.containsKey(i))   adj.put(i,new ArrayList<Integer>());
                    if(!adj.containsKey(j)) adj.put(j,new ArrayList<>());
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int cnt=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(adj,i,visited);
                cnt++;
            }
        }
        return cnt;
    }

    private void dfs(Map<Integer, ArrayList<Integer>> adj, int vertex, boolean[] visited){
        visited[vertex]=true;
        for(int node:adj.get(vertex)){
            if(!visited[node])  dfs(adj,node,visited);
        }
    }
}