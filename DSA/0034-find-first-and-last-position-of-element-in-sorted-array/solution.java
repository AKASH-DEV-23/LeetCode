class Solution {
    private int leftSearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int leftMost = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                leftMost = mid;
                high = mid - 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return leftMost;
    }

    private int rightSearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int rightMost = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                rightMost = mid;
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return rightMost;
    }

    public int[] searchRange(int[] nums, int target) {
        int l = leftSearch(nums, target);
        int r = rightSearch(nums, target);
        return new int[] { l, r };
    }
}
