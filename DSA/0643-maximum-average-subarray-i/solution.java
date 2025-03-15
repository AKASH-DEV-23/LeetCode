class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxi=0;
        int sum=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i<k){
                sum+=nums[i];
                maxi=sum;
                continue;
            }
            sum-=nums[j++];
            sum+=nums[i];
            maxi=Math.max(maxi,sum);
        }
        return (double)maxi/k;
    }
}
