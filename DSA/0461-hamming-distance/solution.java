class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        return setBit(xor);
    }
    private int setBit(int num){
        int cnt=0;
        while(num!=0){
            if(num%2==1)    cnt++;
            num/=2;
        }
        return cnt;
    }
}
