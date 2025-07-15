class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans=new int[numCourses];
         Map<Integer,List<Integer>> adj=new HashMap<>();
        int[] inDegree=new int[numCourses];
        for(int i=0;i<numCourses;i++)   adj.put(i,new ArrayList<>());
        for(int[] edge:prerequisites){
            int u=edge[1];
            int v=edge[0];
            inDegree[v]++;
            adj.get(u).add(v);
        }
        Queue<Integer> myq=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0){
                myq.offer(i);
            }
        }
        int idx=0;
        while(!myq.isEmpty()){
            int size=myq.size();
            for(int i=0;i<size;i++){
                int u=myq.poll();
                ans[idx++]=u;
                for(int v:adj.get(u)){
                    inDegree[v]--;
                    if(inDegree[v]==0)  myq.offer(v);
                }
            }
        }
        for(int num:inDegree) {
            if(num!=0)  return new int[0];
        }
        return ans;
    }
}
