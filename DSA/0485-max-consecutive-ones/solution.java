class Solution {
     public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return max;
    }
}
