class Solution {
    public int longestSubarray(int[] nums) {
        int k=1;
        int start=0;
        int maxOne=0;
        int zero=0;

        for(int end=0; end<nums.length;end++){
            if(nums[end]==0){
                zero++;
            }
            while(zero>k){
                if(nums[start]==0){
                    zero--;
                }
                start++;
            }

            maxOne=Math.max(maxOne, end-start+1);
        }
        return maxOne-1;
    }
}
