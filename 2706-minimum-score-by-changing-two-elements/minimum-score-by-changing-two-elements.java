class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int first2=nums[n-1]-nums[2];
        int last2=nums[n-3]-nums[0];
        int oneFromBothSide=nums[n-2]-nums[1];
        return Math.min(oneFromBothSide,Math.min(first2,last2));
    }
}