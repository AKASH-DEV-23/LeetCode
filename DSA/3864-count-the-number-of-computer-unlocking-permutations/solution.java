class Solution {
    public int countPermutations(int[] nums) {
        if(nums.length<=1)  return 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[0])  return 0;
        }
        final int MOD=1000000007;
        long ans=1;
        for(int i=1;i<nums.length;i++){
            ans=(ans*i)%MOD;
        }
        return (int)ans;
    }
}
