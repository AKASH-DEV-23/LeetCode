class Solution {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        int ans1= binarySearch(nums,0,pivot-1,target); 
        int ans2 = binarySearch(nums,pivot,nums.length-1,target);
        if(ans1 ==-1 && ans2==-1)   return -1;
        if(ans1 ==-1)   return ans2;
        return ans1;    
    }
    private int findPivot(int[] nums){
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return l;
    }
    private int binarySearch(int[] nums, int l, int r, int target){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target)   return mid;
            if(target<nums[mid])    r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
}
