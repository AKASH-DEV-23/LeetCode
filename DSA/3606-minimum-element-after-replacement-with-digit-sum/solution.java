class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;

        for(int temp:nums){
            int digitSum=sumOfDigit(temp);
            ans=Math.min(digitSum,ans);
        }
        return ans;
    }

    public int sumOfDigit(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
