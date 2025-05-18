class Solution {
    boolean[] visited;
    int[] inDegree;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int[] edge:prerequisites){
            int u=edge[1];
            int v=edge[0];
            if(!map.containsKey(u)) map.put(u,new ArrayList<>());
            map.get(u).add(v);
        }
        visited=new boolean[numCourses];
        inDegree=new int[numCourses];
        for(int key:map.keySet()){
            for(int v:map.get(key))
                inDegree[v]++;
        }
        Queue<Integer> q=new LinkedList<>();
        int cnt=0;
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                q.offer(i);
                visited[i]=true;
                cnt++;
            }
        }
        while(!q.isEmpty()){
            int u=q.poll();
            for(int v:map.getOrDefault(u,new ArrayList<>())){
                if(!visited[v]){
                    inDegree[v]--;
                    if(inDegree[v]==0){
                        q.offer(v);
                        visited[v]=true;
                        cnt++;
                    }
                }
            }
        }
        return cnt==numCourses ? true : false;
    }
}
