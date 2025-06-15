class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        dp=new int[m][n];
        for(int[] arr:dp)   Arrays.fill(arr,-1);
        int len=solve(word1,word2,0,0);
        return m-len + n-len;
    }
    private int solve(String word1, String word2, int i, int j){
        if(i>=word1.length() || j>=word2.length())    return 0;
        if(dp[i][j]!=-1)    return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)) return 1+solve(word1,word2,i+1,j+1);
        else{
            int path1=solve(word1,word2,i+1,j);
            int path2=solve(word1,word2,i,j+1);
            return dp[i][j]=Math.max(path1,path2);
        }
    }
}