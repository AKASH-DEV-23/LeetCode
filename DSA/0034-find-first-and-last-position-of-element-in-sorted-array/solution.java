class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        int mid=0;
        boolean flag=true;
        while(st<=end){
            mid=(st+end)/2;
            if(nums[mid]==target){
                flag=false;
                break;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }else   st=mid+1;
        }
        if(flag)    return new int[]{-1,-1};
        int i=mid;
        while(i>=0 && nums[i]==target)  i--;
        while(mid<nums.length && nums[mid]==target) mid++;
        return new int[]{i+1,mid-1};
    }
}
