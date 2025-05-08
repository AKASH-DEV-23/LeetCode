class Solution {
    boolean[] visited;
    public int findCircleNum(int[][] isConnected) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int n=isConnected.length;
        visited=new boolean[n+1];
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    map.get(i+1).add(j+1);
                }
            }
        }
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                DFS(map,i);
                cnt++;
            }
        }
        // System.out.print(map);
        return cnt;
    }
    private void DFS(Map<Integer,List<Integer>> map, int u){
        visited[u]=true;
        for(int v:map.get(u)){
            if(!visited[v]) DFS(map,v);
        }
    } 
}