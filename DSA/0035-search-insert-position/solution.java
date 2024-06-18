class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg = 0;
        int end = nums.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (nums[mid] == target)
                return mid;
            if (target < nums[mid])
                end = mid - 1;
            else
                beg = mid + 1;
        }
        return beg;
    }
}

