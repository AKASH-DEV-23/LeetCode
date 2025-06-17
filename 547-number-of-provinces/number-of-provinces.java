class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int n=isConnected.length;
        for(int i=1;i<=n;i++)   map.put(i,new ArrayList<>());

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i!=j && isConnected[i][j]==1){
                    map.get(i+1).add(j+1);
                }
            }
        }
        int component=0;
        boolean[] visited=new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                // DFS(map,i,visited);
                BFS(map,i,visited);
                component++;
            }
        }
        return component;
    }
    private void DFS(Map<Integer,List<Integer>> map, int u, boolean[] visited){
        visited[u]=true;
        for(int v:map.get(u)){
            if(!visited[v]){
                DFS(map,v,visited);
            }
        }
    }
    private void BFS(Map<Integer,List<Integer>> map, int u, boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.offer(u);
        visited[u]=true;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                int v=q.poll();
                for(int neighbour:map.get(v)){
                    if(!visited[neighbour]){
                        q.offer(neighbour);
                        visited[neighbour]=true;
                    }
                }
            }
        }
    }
}