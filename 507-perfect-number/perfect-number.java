class Solution {
    public boolean checkPerfectNumber(int num) {
        long sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)    sum+=i;
        }
        return sum==num ? true : false;
    }
}