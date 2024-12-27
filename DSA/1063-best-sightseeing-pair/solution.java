class Solution {
    public int maxScoreSightseeingPair(int[] nums) {
        int lmax=0;
        int ans=0;
        for(int j=1;j<nums.length;j++){
            lmax=Math.max(lmax,nums[j-1]+j-1);
            int val=nums[j]-j;
            ans=Math.max(ans,lmax+val);
        }
        return ans;
    }
}
