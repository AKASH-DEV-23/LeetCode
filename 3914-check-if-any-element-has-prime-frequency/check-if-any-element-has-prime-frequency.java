class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq=new int[101];
        for(int num:nums)  freq[num]++;
        for(int num:freq){
            if(checkPrime(num))  return true;
        }
        return false;
    }
    private boolean checkPrime(int n){
        if(n<=1)  return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)  return false;
        }
        return true;
    }
}