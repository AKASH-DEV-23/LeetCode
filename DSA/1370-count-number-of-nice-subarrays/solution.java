class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
      int n1=  helper(nums,k);
      int n2=  helper(nums,k-1);
      return n1-n2;
    }

    private int helper(int[] nums, int k){
        int l=0;
        int r=0;
        int n=nums.length;
        int sum=0;
        int cnt=0;
        while(r<n){
            sum+=nums[r]%2;
            while(sum>k){
                sum-=nums[l]%2;
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}
