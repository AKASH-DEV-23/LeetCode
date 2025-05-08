class Solution {
    boolean[] visited;
    boolean[] isRecurrsion;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int[] graph:prerequisites){
            int u=graph[1];
            int v=graph[0];
            if(!map.containsKey(u)) map.put(u,new ArrayList<>());
            map.get(u).add(v);
        }
        visited=new boolean[numCourses];
        isRecurrsion=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i] && isCycle(map,i))   return false;
        }
        return true;
    }
    private boolean isCycle(Map<Integer, List<Integer>> map, int u){
        visited[u]=true;
        isRecurrsion[u]=true;
        for(int v:map.getOrDefault(u,new ArrayList<>())){
            if(visited[v]==false && isCycle(map,v)) return true;
            else if(isRecurrsion[v])    return true;
        }
        isRecurrsion[u]=false;
        return false;
    }
}