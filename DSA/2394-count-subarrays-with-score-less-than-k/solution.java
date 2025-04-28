class Solution {
    public long countSubarrays(int[] nums, long k) {
        long ans=0;
        int len=nums.length;
        int i=0;
        long sum=0;
        for(int j=0;j<len;j++){
            sum+=nums[j];
            while(i<=j && sum*(j-i+1)>=k){
                sum-=nums[i++];
            }
            ans+=(j-i+1);
        }
        return ans;
    }
}
