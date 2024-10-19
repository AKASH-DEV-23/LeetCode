class Solution {
    public static int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int maxFreq = 0;
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            maxFreq = Math.max(maxFreq, count[nums[i]]);
        }
        int result = 0;
        for (int i = 0; i < 101; i++) {
            if (maxFreq == count[i]) {
                result += maxFreq;
            }
        }
        return result;

    }
}
