class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int zero=0;
        int ans=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0)  zero++;
            while(zero>1){
                if(nums[i]==0)  zero--;
                i++;
            }
            if(zero==0) ans=Math.max(ans,j-i+1);
            if(zero==1) ans=Math.max(ans,j-i);
        }
        if(ans==nums.length)    return ans-1;
        return ans;
    }
}
