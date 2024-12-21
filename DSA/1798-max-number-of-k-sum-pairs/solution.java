class Solution {
    public int maxOperations(int[] nums, int k) {
        int cnt = 0;
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int sum = nums[low] + nums[high];
            if (sum == k) {
                cnt++;
                low++;
                high--;
            } else if (sum < k) {
                low++;
            }else{
                high--;
            }
        }
        return cnt;
    }
}
