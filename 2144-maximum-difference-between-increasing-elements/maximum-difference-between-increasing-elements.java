class Solution {
    public int maximumDifference(int[] nums) {
        int maxi=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                maxi=Math.max(maxi,nums[j]-nums[i]);
            }
        }
        return maxi==0?-1:maxi;
    }
}