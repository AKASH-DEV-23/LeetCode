class Solution {
    boolean[] visited;
    List<Integer> list;
    int[] inDegree;
    int cnt=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
            for(int v:map.get(key)){
                inDegree[v]++;
            }
        }
        list=new ArrayList<>();
        BFS(map);
        if(cnt!=numCourses) return new int[]{};
        int[] ans=new int[list.size()];
        int i=0;
        for(int num:list){
            ans[i++]=num;
        }
        return ans;
    }
    private void BFS(Map<Integer,List<Integer>> map){
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0){
                q.offer(i);
                cnt++;
            }
       }
       while(!q.isEmpty()){
            int u=q.poll();
            list.add(u);
            for(int v:map.getOrDefault(u,new ArrayList<>())){
                inDegree[v]--;
                if(inDegree[v]==0){
                    q.offer(v);
                    cnt++;
                }
            }
        }
    }
}
