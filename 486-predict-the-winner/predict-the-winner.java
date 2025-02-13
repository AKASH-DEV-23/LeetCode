class Solution {
    int[][] dp;

    // Approach - 1

    // public boolean predictTheWinner(int[] nums) {
    //     int sum=0;
    //     dp=new int[23][23];
    //     for(int[] arr:dp)   Arrays.fill(arr,-1);
    //     for(int num:nums)   sum+=num;
    //     int player1 = solve(0,nums.length-1,nums);
    //     int player2=sum-player1;
    //     return player1>=player2;
    // }
    // private int solve(int i, int j, int[] nums){
    //     if(i>j) return 0;
    //     if(i==j)    return nums[i];
    //     if(dp[i][j]!=-1)    return dp[i][j];
    //     int take_i=nums[i] + Math.min(solve(i+2,j,nums), solve(i+1,j-1,nums));
    //     int take_j=nums[j] + Math.min(solve(i+1,j-1,nums), solve(i,j-2,nums));
    //     return dp[i][j]=Math.max(take_i,take_j);
    // }

    // Approach - 2

    public boolean predictTheWinner(int[] nums) {
        dp=new int[23][23];
        for(int[] arr:dp)   Arrays.fill(arr,-1);
        int ans=solve(0,nums.length-1,nums);
        return ans>=0;
    }

    private int solve(int i, int j, int[] nums){
        if(i>j) return 0;
        if(i==j)    return nums[i];
        if(dp[i][j]!=-1)    return dp[i][j];
        int take_i = nums[i]-solve(i+1,j,nums);
        int take_j = nums[j]-solve(i,j-1,nums);
        return dp[i][j]=Math.max(take_i,take_j);
    }
}