class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] ans = new int[(2*n)-1];
        boolean[] visited = new boolean[n+1];
        solve(0,n,ans,visited);
        return ans;
    }

    private boolean solve(int i, int n, int[] ans , boolean[] visited){
        if(i>=ans.length)   return true;
        if(ans[i] != 0){
            return solve(i+1,n,ans,visited);
        }
        for(int num=n; num>=1; num--){
            if(visited[num])    continue;
            visited[num]=true;
            ans[i]=num;
            
            if(num==1){
                if(solve(i+1,n, ans, visited)){
                    return true;
                }
            }else{
                int j=ans[i]+i;
                if(j<ans.length && ans[j]==0){
                    ans[j]=num;
                    if(solve(i+1,n,ans,visited)){
                        return true;
                    }
                    ans[j]=0;
                }
            }
            visited[num]=false;
            ans[i]=0;
        }
        return false;
    }
}
