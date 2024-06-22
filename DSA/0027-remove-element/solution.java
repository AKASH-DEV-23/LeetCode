class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int n : nums) {
            if (n != val) {
                nums[count] = n;
                count++;
            }
        }
        return count;
    }
}
