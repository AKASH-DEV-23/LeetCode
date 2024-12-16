class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int min=nums[0];
            int idx=0;
            for(int j=0;j<nums.length;j++){
                if(min>nums[j]){
                    min=nums[j];
                    idx=j;
                }
            }
            nums[idx]=nums[idx]*multiplier;
        }
        return nums;
    }
}
