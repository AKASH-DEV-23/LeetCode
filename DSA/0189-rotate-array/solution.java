class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int len = nums.length;
        swap(nums, 0, len - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, len - 1);
    }

    private void swap(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
