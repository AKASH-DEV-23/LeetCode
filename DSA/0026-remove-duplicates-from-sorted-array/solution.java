class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int n : nums) {
            if (j < 1 || n != nums[j - 1]) {
                nums[j] = n;
                j++;
            }
        }
        return j;
    }
}
