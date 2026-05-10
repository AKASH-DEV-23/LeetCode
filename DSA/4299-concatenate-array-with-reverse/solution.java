class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int idx=ans.length-1;
        for(int i=0;i<nums.length;i++){
            ans[idx--]=nums[i];
        }
        return ans;
    }
}
