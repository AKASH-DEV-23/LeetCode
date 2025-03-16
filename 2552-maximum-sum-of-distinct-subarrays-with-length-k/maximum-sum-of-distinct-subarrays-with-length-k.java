class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        int j = 0;
        long maxi = 0;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            while (set.contains(nums[i])) {
                set.remove(nums[j]);
                sum-=nums[j++];
            }
            set.add(nums[i]);
            sum += nums[i];
            if (i - j + 1 == k) {
                maxi = Math.max(maxi, sum);
                set.remove(nums[j]);
                sum -= nums[j++];
            }
        }
        return maxi;
    }
}