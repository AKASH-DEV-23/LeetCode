class Solution{
    public boolean checkEqualPartitions(int[] nums, long target) {
         int n=nums.length;
         boolean ans= helper(nums,0,1L,1L,0,target);
        return ans;
    }
    private boolean helper(int[] nums,int idx, long p1, long p2, int cnt, long target){
        if(idx==nums.length) {
            return cnt>0 && p1==target && p2==target;
        }
        if(p1>target || p2>target)  return false;
        if(helper(nums,idx+1,p1*nums[idx],p2,cnt+1,target))  return true;
        if(cnt>0 && helper(nums,idx+1,p1,p2*nums[idx],cnt,target))  return true;
        return false;
    }
}
