class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int len = nums.length;
        while (len > 0) {
            sum += len;
            len--;
        }
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
