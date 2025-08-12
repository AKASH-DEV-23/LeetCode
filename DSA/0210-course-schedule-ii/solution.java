class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> adj=new HashMap<>();
        int[] inDegree=new int[numCourses];
        for(int[] pre:prerequisites){
            int u=pre[1];
            int v=pre[0];
            if(!adj.containsKey(u))    adj.put(u,new ArrayList<>());
            adj.get(u).add(v);
            inDegree[v]++;
        }
        Queue<Integer> myq=new LinkedList<>();
        int[] ans=new int[numCourses];
        int idx=0;
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                myq.offer(i);
            }
        }
        while(!myq.isEmpty()){
            int u=myq.poll();
            ans[idx++]=u;
            for(int v:adj.getOrDefault(u,new ArrayList<>())){
                inDegree[v]--;
                if(inDegree[v]==0){
                    myq.offer(v);
                }
            }
        }   
        for(int num:inDegree)   if(num>0)   return new int[0];
        return ans;
    }
}
