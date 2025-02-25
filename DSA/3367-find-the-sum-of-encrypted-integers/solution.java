class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int digitSum=0;
        for(int num:nums){
            int sum = helper(num);
            digitSum+=sum;
        }
        return digitSum;
    }
    private int helper(int num){
        int cnt=0;
        int rem=0;
        int maxSum=0;
        while(num>0){
            rem=Math.max(rem,num%10);
            num/=10;
            cnt++;
        }
        while(cnt>0){
            maxSum=maxSum*10+rem;
            cnt--;
        }
        return maxSum;
    }
}
