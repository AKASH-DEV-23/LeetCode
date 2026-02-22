class Solution {
    public boolean isDigitorialPermutation(int n) {
        int pro=0;
        int num=n;
        int[] freq=new int[10];
        while(n!=0){
            int rem=n%10;
            freq[rem]++;
            n/=10;
            pro+=fact(rem);
        }
        while(pro!=0){
            freq[pro%10]--;
            pro/=10;
        }
        for(int curr:freq){
            if(curr!=0)  return false;
        }
        return true;
    }
    private int fact(int num){
        if(num<=1)  return 1;
        return num*fact(num-1);
    }
}
