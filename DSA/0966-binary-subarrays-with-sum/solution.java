class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      int cnt1=  helper(nums,goal);
      int cnt2=  helper(nums,goal-1);
      return cnt1-cnt2;
    }
    public int helper(int[] nums, int goal) {
        if(goal<0)  return 0;
        int i=0;
        int j=0;
        int cnt=0;
        int n=nums.length;
        int sum =0;
        while(j<n){
            sum+=nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }
            cnt+=j-i+1;
            j++;
        }
        return cnt;
    }
    
}
