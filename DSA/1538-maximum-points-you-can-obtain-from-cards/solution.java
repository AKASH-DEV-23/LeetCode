class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum=0;
        int rsum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            lsum+=nums[i];
        }
        maxSum=lsum;
        int ridx=nums.length-1;
        for(int i=k-1;i>=0;i=i-1){
            lsum-=nums[i];
            rsum+=nums[ridx];
            ridx--;
            maxSum=Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
        
    }
}
