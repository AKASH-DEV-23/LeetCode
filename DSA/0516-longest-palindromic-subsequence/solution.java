class Solution {
    int[][] dp=new int[1001][1001];
    public int longestPalindromeSubseq(String s) {
        for(int[] arr:dp)   Arrays.fill(arr,-1);
        return solve(s,0,s.length()-1);
    }
    private int solve(String s, int i, int j){
        if(i>j) return 0;
        if(i==j)    return 1;
        if(dp[i][j]!=-1)    return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return 2+solve(s,i+1,j-1);
        }else{
            int path1=solve(s,i+1,j);
            int path2=solve(s,i,j-1);
            return dp[i][j] = Math.max(path1,path2);
        }
    }
}
