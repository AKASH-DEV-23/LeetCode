class Solution {
    public int countBeautifulPairs(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int digit1=(""+nums[i]).charAt(0)-'0';
                int digit2=nums[j]>9 ? nums[j]%10:nums[j];
                if(isGCD(digit1,digit2)==1) cnt++;
            }
        }
        return cnt;
    }
    private int isGCD(int a, int b){
        if(b==0)    return a;
        return isGCD(b,a%b);
    }
}