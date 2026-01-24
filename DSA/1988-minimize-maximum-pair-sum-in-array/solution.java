class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MIN_VALUE;
        while(low<high){
            ans=Math.max(ans,nums[low]+nums[high]);
            low++;
            high--;
        }
        return ans;
    }
}
