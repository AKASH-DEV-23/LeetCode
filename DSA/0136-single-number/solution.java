class Solution {
    public int singleNumber(int[] nums) {
        int cnt=0;
        for(int num:nums){
            cnt^=num;
        }
        return cnt;
    }
}
