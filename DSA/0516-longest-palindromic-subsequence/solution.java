class Solution {
    int[][] dp=new int[1001][1001];
    public int longestPalindromeSubseq(String s) {
        for(int[] arr:dp)   Arrays.fill(arr,-1);
        // return solve(s,0,s.length()-1);
        int n=s.length();
        String rev=new StringBuilder(s).reverse().toString();
        int[][] grid=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==rev.charAt(j-1))  grid[i][j]=1+grid[i-1][j-1];
                else{
                    grid[i][j]=Math.max(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[n][n];
    }
    // private int solve(String s, int i, int j){
    //     if(i>j) return 0;
    //     if(i==j)    return 1;
    //     if(dp[i][j]!=-1)    return dp[i][j];
    //     if(s.charAt(i)==s.charAt(j))    return dp[i][j]= 2+solve(s,i+1,j-1);
    //     else{
    //         int path1=solve(s,i+1,j);
    //         int path2=solve(s,i,j-1);
    //         return dp[i][j]= Math.max(path1,path2);
    //     }
    // }
}
