class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int cnt=0;
        for(int i=0;i<=n;i++){
            cnt^=i;
        }

        for(int num:nums){
            cnt^=num;
        }
        return cnt;
    }
}
