class Solution {
    public int maximumProduct(int[] nums) {
        int last3=1;
        Arrays.sort(nums);
        int n=nums.length;
        last3=nums[n-1]*nums[n-2]*nums[n-3];
        int first2=1;
        first2=nums[0]*nums[1]*nums[n-1];
        return Math.max(first2,last3);
    }
}
