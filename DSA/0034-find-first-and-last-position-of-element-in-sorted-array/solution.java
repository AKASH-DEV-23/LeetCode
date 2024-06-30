class Solution {
        public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[] { -1, -1 };
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                start = mid;
                end = mid;
                while (start > 0 && nums[start - 1] == target) {
                    start--;
                }
                while (end < nums.length - 1 && nums[end + 1] == target) {
                    end++;
                }
                result[0] = start;
                result[1] = end;
                return result;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

}
