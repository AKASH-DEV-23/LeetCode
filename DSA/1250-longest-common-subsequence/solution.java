class Solution {
    int[][]dp=new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
        for(int[] arr:dp)   Arrays.fill(arr,-1);
        return solve(text1,text2,0,0);
    }
    private int solve(String s1, String s2, int i, int j){
        if(i>=s1.length() || j>=s2.length())    return 0;
        if(dp[i][j]!=-1)    return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+solve(s1,s2,i+1,j+1);
        }else{
            int path1=solve(s1,s2,i+1,j);
            int path2=solve(s1,s2,i,j+1);
            return dp[i][j]=Math.max(path1,path2);
        }
    }
}
