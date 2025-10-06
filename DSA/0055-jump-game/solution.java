class Solution {
    public boolean canJump(int[] nums) {
        int low=0;
        int high=0;
        int n=nums.length;
        while(high<n-1){
            int farthest=high;
            for(int idx=low;idx<=high;idx++){
                farthest=Math.max(farthest,idx+nums[idx]);
            }
            if(farthest==high)  return false;
            low=high+1;
            high=farthest;
        }
        return true;
    }
}
