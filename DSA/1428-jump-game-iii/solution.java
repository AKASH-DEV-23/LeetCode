class Solution {
    Boolean[] visited;
    public boolean canReach(int[] arr, int start) {
        visited=new Boolean[arr.length];
        return solve(arr, start);
    }
    private boolean solve(int[] arr, int index){
        if(arr[index]==0)   return true;
        if(visited[index]!=null)  return false;
        visited[index]=true;

        int nextMove=index+arr[index];
        if(nextMove<arr.length){
            if(solve(arr,nextMove)) return true;
        }

        int prevMove=index-arr[index];
        if(prevMove>=0){
            if(solve(arr,prevMove)) return true;
        }

        return false;
    }
}
