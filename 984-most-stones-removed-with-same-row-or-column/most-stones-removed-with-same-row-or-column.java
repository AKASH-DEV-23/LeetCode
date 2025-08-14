class Solution {
    public int removeStones(int[][] stones) {
        int n=stones.length;
        boolean[] visited=new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                DFS(i,stones,visited);
                cnt++;
            }
        }
        return n-cnt;
    }
    private void DFS(int idx, int[][] stones, boolean[] visited){
        visited[idx]=true;
        for(int i=0;i<stones.length;i++){
            int r=stones[idx][0];
            int c=stones[idx][1];
            if(!visited[i] && (r==stones[i][0] || c==stones[i][1])){
                DFS(i,stones,visited);
            }
        }
    }
}