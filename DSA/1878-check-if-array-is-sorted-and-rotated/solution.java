class Solution {
    public boolean check(int[] nums) {
        if(nums==null || nums.length==0 || nums.length==2)  return true;
        int slop=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length])   slop++;
        }
        return slop<2;
    }
}
