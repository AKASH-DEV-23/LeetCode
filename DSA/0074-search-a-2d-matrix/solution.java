class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int n[]: matrix){
            for(int m:n){
                if(m==target){
                    return true;
                }
            }
        }
        return false;
    }
}
