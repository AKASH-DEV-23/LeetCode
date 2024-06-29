class Solution {
   public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] num : matrix) {
            for (int n : num) {
                if (target == n) {
                    return true;
                }
            }
        }
        return false;

    }
}
