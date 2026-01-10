class Solution {
    int[][] dp;
    int m;
    int n;
    public int minimumDeleteSum(String s1, String s2) {
        m=s1.length();
        n=s2.length();
        dp=new int[m+1][n+1];
        subsequence(s1,s2);
        int sum1=getASCII(s1);
        int sum2=getASCII(s2);
        return sum1+sum2-(2*dp[m][n]);
    }

    private void subsequence(String s1, String s2){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+(int)s1.charAt(i-1);
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
    }

    private int getASCII(String s){
        int sum=0;
        for(char ch:s.toCharArray()){
            sum+=(int)ch;
        }
        return sum;
    }
}
