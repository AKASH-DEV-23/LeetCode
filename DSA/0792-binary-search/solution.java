class Solution {
    public int search(int[] nums, int target) {
        int beg=0;
        int end=nums.length-1;
        int mid=0;
        while(beg<=end){
              mid=(beg+end)/2;
            if(nums[mid]==target)
                 return mid;
            else if(target<nums[mid])
                 end=mid-1;
            else if(target>nums[mid])
                 beg=mid+1;
        }
        return -1;
    }
}
