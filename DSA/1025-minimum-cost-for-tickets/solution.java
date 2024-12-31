class Solution {
    int[] dp;
    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        dp=new int[366];
        Arrays.fill(dp,-1);
        return helper(days,costs,n,0);
    }

    private int helper(int[] days, int[] costs, int n, int i){
        if(i>=n){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }
        int cost_1 = costs[0]+helper(days,costs,n,i+1);

        int maxDay=days[i]+7;
        int j=i;
        while(j<n && days[j]<maxDay){
            j++;
        }
        int cost_7=costs[1]+helper(days,costs,n,j);

        maxDay=days[i]+30;
        j=i;
        while(j<n && days[j]<maxDay){
            j++;
        }
        int cost_30=costs[2]+helper(days,costs,n,j);

        return dp[i]=Math.min(Math.min(cost_1,cost_7),cost_30);
    }
}
