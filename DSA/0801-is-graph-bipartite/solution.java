class Solution {
    public boolean isBipartite(int[][] graph) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<graph.length;i++){
            map.put(i,new ArrayList<>());
            for(int v:graph[i]){
                map.get(i).add(v);
            }
        }
        int[] color=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                if(isBipartiteBFS(map,i,color,1)==false)    return false;
            }
        }
        return true;
    }
    private boolean isBipartiteBFS(Map<Integer,List<Integer>> map, int u, int[] color, int currColor){
        color[u]=currColor;
        Queue<Integer> q=new LinkedList<>();
        q.offer(u);
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int v: map.get(curr)){
                if(color[v]==color[curr])   return false;
                else if(color[v]==-1){
                    color[v]=1-color[curr];
                    q.offer(v);
                }
            }
        }
        return true;
    }
}
