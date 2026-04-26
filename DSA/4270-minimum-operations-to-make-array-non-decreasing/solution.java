class Solution {
    public long minOperations(int[] nums) {
        long prev=nums[0];
        long sum=0;
        for(int i=1;i<nums.length;i++){
            long curr=sum+nums[i];
            if(curr<prev){
                sum+=(prev-curr);
            }
            prev=sum+nums[i];
        }
        return sum;
    }
}
