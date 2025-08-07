class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
            int bin=binary(i);
            if(checkPrime(bin)) cnt++;
        }
        return cnt;
    }
    private int binary(int num){
        int cnt=0;
        while(num!=0){
            cnt+=num%2==1?1:0;
            num/=2;
        }
        return cnt;
    }
    private boolean checkPrime(int num){
        if(num<=1)  return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)    return false;
        }
        return true;
    }
}
