class Solution {
    public int countSubarrays(int[] nums) {
        int len=nums.length;
        int count=0;
        for(int i=2;i<len;i++){
            if((nums[i]+nums[i-2])*2==nums[i-1]){
                count++;
            }
        }
        return count;
    }
}