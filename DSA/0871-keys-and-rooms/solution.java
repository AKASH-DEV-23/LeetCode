class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int V=rooms.size();
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        visited[0]=true;
        for(int num:rooms.get(0)){
            q.offer(num);
            visited[num]=true;
        }
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                int u=q.poll();
                for(int v:rooms.get(u)){
                    if(!visited[v]){
                        q.offer(v);
                        visited[v]=true;
                    }
                }
            }
        }
        for(boolean flag:visited){
            if(!flag)   return false;
        }
        return true;
    }
}
