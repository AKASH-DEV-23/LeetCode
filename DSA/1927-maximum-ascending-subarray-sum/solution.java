class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum=0;
        int val=0;
        int sum=0;
        for(int num:nums){
            if(val<num){
                sum+= num;
                val=num;
                maxSum=Math.max(sum,maxSum); 
            }else{
                val=num;
                sum=num;
                maxSum=Math.max(sum,maxSum); 
            }
        }
        return maxSum;
    }
}
