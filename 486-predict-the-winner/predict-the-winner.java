class Solution {
    public boolean predictTheWinner(int[] nums) {
        int sum=0;
        for(int num:nums)   sum+=num;
        int player1 = solve(0,nums.length-1,nums);
        int player2=sum-player1;

        return player1>=player2;
    }
    private int solve(int i, int j, int[] nums){
        if(i>j) return 0;
        if(i==j)    return nums[i];

        int take_i=nums[i] + Math.min(solve(i+2,j,nums), solve(i+1,j-1,nums));
        int take_j=nums[j] + Math.min(solve(i+1,j-1,nums), solve(i,j-2,nums));

        return Math.max(take_i,take_j);
    }
}