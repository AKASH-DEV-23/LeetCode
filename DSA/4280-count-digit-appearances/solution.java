class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans=0;
        for(int num:nums){
            while(num!=0){
                int rem=num%10;
                if(rem==digit)  ans++;
                num/=10;
            }
        }
        return ans;
    }
}
