class Solution {
    public int triangularSum(int[] nums) {
        while(true){
            if(nums.length==1){
                break;
            }
            nums=solve(nums);
        }
        return nums[0];
    }
    private int[] solve(int[] nums){
        int n=nums.length;
        int[] ans=new int[n-1];
        for(int i=1;i<n;i++){
            ans[i-1]=(nums[i-1]+nums[i])%10;
        }
        return ans;
    }
}
