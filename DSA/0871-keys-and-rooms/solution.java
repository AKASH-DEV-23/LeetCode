class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        dfs(0,rooms,visited);
        for(boolean isCheck:visited){
            if(!isCheck) return false;
        }
        return true;
    }

    private void dfs(int key, List<List<Integer>> rooms,boolean[] visited){
        visited[key]=true;
        for(Integer newKey:rooms.get(key)){
            if(!visited[newKey])
                dfs(newKey,rooms,visited);
        }
    }
}
