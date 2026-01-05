class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int totalNeg=0;
        long ans =0;
        int min=Integer.MAX_VALUE;
        for(int[] temp : matrix){
            for(int num:temp){
                if(num<0){
                    totalNeg++;
                }
                ans+=Math.abs(num);
                min=Math.min(min,(int)Math.abs(num));
            }
        }
        if(totalNeg%2==0){
            return ans;
        }
        return (long)ans-2*min;
    }
}
