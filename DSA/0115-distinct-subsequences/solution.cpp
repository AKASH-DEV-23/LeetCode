class Solution {
public:
int solve(string &s,string &t,int i,int j,vector<vector<int>>&dp){
    if(j==t.size()) return 1;
    if(i==s.size()) return 0;
    if(dp[i][j]!=-1) return dp[i][j];
     int pick=0;
    if(s[i]==t[j]) pick=solve(s,t,i+1,j+1,dp);
    int notpick=solve(s,t,i+1,j,dp);
    return dp[i][j]=pick+notpick;
}
    int numDistinct(string s, string t) {
        vector<vector<int>>dp(s.size(),vector<int>(t.size(),-1));
        return solve(s,t,0,0,dp);
        // for(int i=1;i<s.size();i++){
        //     for(int j=1;j<t.size();j++)
        // }
    }
};
