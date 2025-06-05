class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            int u=edge[1];
            int v=edge[0];
            map.get(u).add(v);
        }
        int[] inDegree=new int[numCourses];
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
            for(int v:entry.getValue()){
                inDegree[v]++;
            }
        } 
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                q.offer(i);
                visited[i]=true;
            }
        }
        int[] ans=new int[numCourses];
        int idx=0;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                int u=q.poll();
                for(int v:map.get(u)){
                    inDegree[v]--;
                    if(inDegree[v]==0){
                        q.offer(v);
                        visited[v]=true;
                    }
                }
                ans[idx++]=u;
            }
        }
        for(boolean flag:visited){
            if(!flag)   return new int[]{};
        }
        return ans;
    }
}
