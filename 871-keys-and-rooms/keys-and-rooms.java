class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        dfs(rooms.get(0),0,rooms,visited);
        for(boolean isCheck:visited){
            if(!isCheck) return false;
        }
        return true;
    }

    private void dfs(List<Integer> roomToEnter, int key, List<List<Integer>> rooms,boolean[] visited){
        visited[key]=true;
        for(Integer newKey:roomToEnter){
            if(!visited[newKey])
                dfs(rooms.get(newKey),newKey,rooms,visited);
        }
    }
}