class Solution {
    Integer[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        // dp=new Integer[text1.length()][text2.length()];
        // return solve(text1,text2,0,0);
        int[][] dp1=new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp1[i][j]=1+dp1[i-1][j-1];
                }else{
                    dp1[i][j]=Math.max(dp1[i-1][j],dp1[i][j-1]);
                }
            }
        }
        return dp1[text1.length()][text2.length()];
    }

    private int solve(String s1, String s2, int i, int j){
        if(i==s1.length() || j==s2.length())    return 0;
        if(dp[i][j]!=null)  return dp[i][j];
        int both=0;
        int skipI=0;
        int skipJ=0;
        if(s1.charAt(i)==s2.charAt(j)){
            both=1+solve(s1,s2,i+1,j+1);
        }else{
            skipI=solve(s1,s2,i+1,j);
            skipJ=solve(s1,s2,i,j+1);
        }
        return dp[i][j]= both+Math.max(skipI,skipJ); 
    }

}
