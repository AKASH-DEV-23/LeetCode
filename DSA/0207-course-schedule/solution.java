class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] arr: prerequisites){
            adj.get(arr[0]).add(arr[1]);
        }

        int inStack[]=new int[numCourses];
        int visited[] =new int[numCourses];

        for(int i=0;i<numCourses;i++){
            if(dfs(adj,inStack,visited,i)){
                return false;
            }
        }
        return true;
    }

    private static boolean dfs(List<List<Integer>> adj, int[] inStack, int[] visited, int i){
        if(inStack[i]==1){
            return true;
        }
        if(visited[i]==1){
            return false;
        }

        inStack[i]=1;
        visited[i]=1;

        for(int n:adj.get(i)){
            if(dfs(adj,inStack,visited,n)){
                return true;
            }
        }

        inStack[i]=0;
        return false;
    }
}
