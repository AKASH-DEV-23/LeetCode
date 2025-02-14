class Solution {
    public int minDifference(int[] nums) {
        int n=nums.length;
        if(n<5) return 0;
        Arrays.sort(nums);
        int removeF=nums[n-1]-nums[3];
        int removeL = nums[n-4]-nums[0];
        int twoFirst_one_last = nums[n-2]-nums[2];
        int twoLast_one_f = nums[n-3]-nums[1];
        return Math.min(twoLast_one_f,Math.min(removeF,Math.min(removeL,twoFirst_one_last)));
    }
}