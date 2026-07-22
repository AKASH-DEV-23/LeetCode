class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null || nums.length==0)    return -1;
        int ans=0;
        int cntZero=0;
        for(int num:nums){
            if(num==1)  cntZero++;
            ans=Math.max(ans,cntZero);
            if(num==0)  cntZero=0;
        }
        return ans;
    }
}
