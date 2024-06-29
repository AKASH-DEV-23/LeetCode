class Solution {
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) {
                return false;
            } else {
                reachable = Math.max(reachable, i + nums[i]);
            }
        }
        return true;
    }
}
