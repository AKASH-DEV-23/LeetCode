class Solution {
    public int minimumSwaps(int[] nums) {
        int zero=0;
        for(int num:nums){
            if(num==0)  zero++;
        }
        int cost=0;
        if(zero==0)  return 0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=0){
                cost++;
            }
            zero--;
            if(zero==0){
                return cost;
            }
        }
        return cost;
    }
}
