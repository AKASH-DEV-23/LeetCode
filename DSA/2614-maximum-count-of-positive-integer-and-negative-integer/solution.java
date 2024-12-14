class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int neg = 0;
        int pos = 0;
        for (int num : nums) {
            if (num < 0) {
                neg++;
            } else if (num == 0) {
                n--;
            } else {
                break;
            }
        }
        return Math.max(neg, Math.abs(n - neg));
    }
}
