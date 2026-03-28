class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==1 && nums[j]==2){
                    ans=Math.min(ans,Math.abs(j-i));
                }else if(nums[i]==2 && nums[j]==1){
                    ans=Math.min(ans,Math.abs(j-i));
                }
            }
        }

        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}
