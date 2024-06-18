class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int arr[] : matrix) {
            for (int n : arr) {
                if (target == n)
                    return true;
            }
        }
        return false;
    }
}
