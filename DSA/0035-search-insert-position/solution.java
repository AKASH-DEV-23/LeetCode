class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1])  return nums.length;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target)    l=mid+1;
            else r=mid;
        }
        return l;
    }
}
