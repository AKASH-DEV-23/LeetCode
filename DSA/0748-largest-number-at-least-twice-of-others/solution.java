class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int maxIdx=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                maxIdx=i;
            }
        }
        nums[maxIdx]=0;
        for(int num:nums){
            if(num*2>max){
                return -1;
            }
        }
        return maxIdx;
    }
}

