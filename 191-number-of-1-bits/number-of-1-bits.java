class Solution {
    public int hammingWeight(int n) {
        return setBitCount(n);   
    }
    private int setBitCount(int num){
        int cnt=0;
        while(num!=0){
            if(num%2==1)    cnt++;
            num/=2;
        }
        return cnt;
    }
}