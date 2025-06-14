class Solution {
    int[][] dp=new int[501][501];
    public int minInsertions(String s) {
        for(int[] arr:dp)   Arrays.fill(arr,-1);
        return solve(s,0,s.length()-1);
    }
    private int solve(String s, int i, int j){
        if(i>j || i==j) return 0;
        if(dp[i][j]!=-1)    return dp[i][j];
        if(s.charAt(i)==s.charAt(j))    return solve(s,i+1,j-1);
        else{
            int path1=1+solve(s,i+1,j);
            int path2=1+solve(s,i,j-1);
            return dp[i][j]= Math.min(path1,path2);
        }
    }
}
