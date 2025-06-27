class Solution {
    public int search(int[] nums, int target) {
        return solve(nums,0,nums.length-1,target);
    }
    private int solve(int[] nums, int low, int high, int target){
        if(low>high)    return -1;
        int mid=low+(high-low)/2;
        if(nums[mid]==target)   return mid;
        else if(nums[mid]<target)  return solve(nums,mid+1,high,target);
        else  return solve(nums,low,mid-1,target);
    }
}
