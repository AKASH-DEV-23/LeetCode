class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int max = 0;
        max = n * (n + 1) / 2;
        for (int num : nums) {
            max -= num;
        }
        return max;
    }
}
