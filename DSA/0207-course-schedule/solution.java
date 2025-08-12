class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> adj=new HashMap<>();
        int[] inDegree=new int[numCourses]; 
        for(int[] edge:prerequisites){
            int u=edge[1];
            int v=edge[0];
            if(!adj.containsKey(u))    adj.put(u,new ArrayList<>());
            adj.get(u).add(v);
            inDegree[v]++;
        }
        Queue<Integer> myq=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0)  myq.offer(i);
        }
        while(!myq.isEmpty()){
            int u=myq.poll();
            for(int neigh:adj.getOrDefault(u,new ArrayList<>())){
                inDegree[neigh]--;
                if(inDegree[neigh]==0)  myq.offer(neigh);
            }
        } 
        for(int num:inDegree)   if(num>0)   return false;
        return true;
    }
}
