class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int num:nums){
            sum+=num%k;
        }
        return sum%k;
    }
}
