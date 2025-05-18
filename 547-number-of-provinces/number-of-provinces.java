class Solution {
    boolean[] visited;
    public int findCircleNum(int[][] isConnected) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)    continue;
                if(isConnected[i][j]==1){
                    if(!map.containsKey(i)) map.put(i,new ArrayList<>());
                    map.get(i).add(j);
                }
            }
        }
        int cnt=0;
        visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                BFS(map,i);
                cnt++;
            }
        }
        return cnt;
    }
    private void BFS(Map<Integer,List<Integer>> map, int u){
        Queue<Integer> q=new LinkedList<>();
        visited[u]=true;
        q.offer(u);
        while(!q.isEmpty()){
            u=q.poll();
            for(int v:map.getOrDefault(u,new ArrayList<>())){
                if(!visited[v]){
                    q.offer(v);
                    visited[v]=true;
                }
            }
        }
    }
}