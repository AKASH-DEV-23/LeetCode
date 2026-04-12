class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[nums.length+1];
        int idx=0;
        for(int num:nums)   arr[idx++]=num;
        arr[idx]=Integer.MAX_VALUE;
        int lb=lowerBound(arr,target);
        int ub=upperBound(arr,target);
        if(nums.length==0 || arr[lb]!=target)    return new int[]{-1,-1};
        ub-=1;
        return new int[]{lb,ub};
    }

    private int lowerBound(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target)    low=mid+1;
            else    high=mid;
        }
        return low;
    }

    private int upperBound(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target)   low=mid+1;
            else   high=mid;
        }
        return low;
    }
}
