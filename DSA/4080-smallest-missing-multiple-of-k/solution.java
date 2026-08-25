class Solution {
    public int missingMultiple(int[] nums, int k) {

        Arrays.sort(nums);

        for(int i=1;i<=100;i++){
            boolean isAvailable=binarySearch(nums,k*i);
            if(!isAvailable){
                return k*i;
            }
        }

        return k*101;
    }

    private boolean binarySearch(int[] nums, int target){
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=(low+high)>>>1;
            if(nums[mid]==target){
                return true;
            }else if(target<nums[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return false;
    }
}
