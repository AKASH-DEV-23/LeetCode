class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        int preMax=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>preMax){
                preMax=nums[i];
            }else{
                ans+=preMax-nums[i]+1;
                preMax+=1;
            }
        }
        return ans;
    }
}