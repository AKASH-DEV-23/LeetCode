class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        for(int[] row:grid){
            for(int num:row){
                if(!set.contains(num))  set.add(num);
                else    ans[0]=num;
            }
        }
        int n=grid[0].length;
        n*=n;
        int sum = n*(n+1)/2;
        int givenSum=0;
        for(int num:set){
            givenSum+=num;
        }
        ans[1]=sum-givenSum;
        return ans;
    }
}
