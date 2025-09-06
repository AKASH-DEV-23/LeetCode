class Solution {
    public int search(int[] nums, int target) {
        return solve(0,nums.length-1,nums,target);
    }
    private int solve(int left, int right , int[] nums, int target){
        if(left>right)  return -1;
        int mid=left+(right-left)/2;
        if(nums[mid]==target)   return mid;
        if(target<nums[mid])   return solve(left,mid-1,nums,target);
        else    return solve(mid+1,right,nums,target);
    }
}
