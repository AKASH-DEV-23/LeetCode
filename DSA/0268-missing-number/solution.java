class Solution {
    public int missingNumber(int[] nums) {
        if(nums==null || nums.length==0)    return -1;
        int n=nums.length;
        int sum=0;
        for(int num:nums)   sum+=num;
        return (n*(n+1)/2)-sum;
    }
}
