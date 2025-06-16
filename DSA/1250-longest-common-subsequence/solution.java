class Solution {
    // int[][] dp=new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
        // for(int[] arr:dp) Arrays.fill(arr,-1);
        // return solve(text1,text2,0,0);
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)) dp[i][j]= dp[i-1][j-1]+1;
                else    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        // System.out.println(Arrays.deepToString(dp));
        return dp[m][n];
    }
    // private int solve(String s1, String s2, int i, int j){
        // if(i>=s1.length() || j>=s2.length())    return 0;
        // if(dp[i][j]!=-1)    return dp[i][j];
        // if(s1.charAt(i) == s2.charAt(j))    return dp[i][j]= 1+solve(s1,s2,i+1,j+1);
        // else{
        //     int path1=solve(s1,s2,i+1,j);
        //     int path2=solve(s1,s2,i,j+1);
        //     return dp[i][j]= Math.max(path1,path2);
        // }
    // }
}
