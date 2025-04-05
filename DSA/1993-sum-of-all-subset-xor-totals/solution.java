class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    private int helper(int[] nums,int idx, int xor){
        if(idx>=nums.length)    return xor;
        int with=helper(nums,idx+1,xor^nums[idx]);
        int without=helper(nums,idx+1,xor);
        return with+without;
    }
}
