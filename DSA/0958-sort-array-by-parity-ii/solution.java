class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0;
        int odd=1;
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[even]=nums[i];
                even=even+2;
            }else{
                ans[odd]=nums[i];
                odd=odd+2;
            }
        }
        return ans;
    }
}
