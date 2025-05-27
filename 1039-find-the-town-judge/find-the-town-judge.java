class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree=new int[n+1];
        int[] outDegree=new int[n+1];
        for(int [] graph:trust){
            int u=graph[0];
            int v=graph[1];
            inDegree[v]++;
            outDegree[u]++;
        }
        for(int i=1;i<=n;i++){
            if(inDegree[i]==n-1 && outDegree[i]==0)     return i;
        }
        return -1;
    }
}