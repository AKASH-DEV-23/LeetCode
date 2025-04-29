class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi=-1;
        int n=nums.length;
        for(int num:nums)   maxi=Math.max(maxi,num);
        int cnt=0;
        int i=0;
        long ans=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==maxi){
                cnt++;
            }
            while(cnt>=k){
                if(nums[i]==maxi){
                    cnt--;
                }
                i++;
            }
            ans+=i;
        }
        return ans;
    }
}