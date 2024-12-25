class Solution {
    int n=0;
    int[][] dp=new int[2505][2505];
    public int lengthOfLIS(int[] nums) {
        n=nums.length;
    for(int[] row : dp){
        Arrays.fill(row,-1);
    }
        return helper(nums,0,-1);
    }
    

    private int helper(int[] nums, int i, int P){
        if(i>=n){
            return 0;
        }
        int take=0;
        int prev=P+1;
        if(dp[i][prev] !=-1){
            return dp[i][prev];
        }
        if(P ==-1 || nums[i]>nums[P]){
             take = 1+helper(nums, i+1, i);
        }
        int skip=helper(nums,i+1,P);
        if(P!=-1){
            dp[i][prev]=Math.max(take,skip);
        }

        return Math.max(take,skip);
    }
}

// class Solution {
//     int n = 0;
//     int[][] dp = new int[2505][2505];

//     public int lengthOfLIS(int[] nums) {
//         n = nums.length;
//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }
//         return helper(nums, 0, -1);
//     }

//     private int helper(int[] nums, int i, int P) {
//         if (i >= n) {
//             return 0;
//         }

//         int prev = P + 1; // Offset to handle P = -1 safely

//         // Return memoized result if available
//         if (dp[i][prev] != -1) {
//             return dp[i][prev];
//         }

//         // Option 1: Take the current element if it's valid
//         int take = 0;
//         if (P == -1 || nums[i] > nums[P]) {
//             take = 1 + helper(nums, i + 1, i);
//         }

//         // Option 2: Skip the current element
//         int skip = helper(nums, i + 1, P);

//         // Memoize the result
//         dp[i][prev] = Math.max(take, skip);

//         return dp[i][prev];
//     }
// }

