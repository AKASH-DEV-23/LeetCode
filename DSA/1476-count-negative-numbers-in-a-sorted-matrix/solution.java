class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        for(int[] row:grid){
            for(int num:row){
                if(num<0)   cnt++;
            }
        }
        return cnt;
    }
}
