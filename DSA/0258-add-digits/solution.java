class Solution {
    public int addDigits(int num) {
        if(0<=num && num<=9){
            return num;
        }
        int rem=0;
        while(num>0){
            rem+=num%10;
            num/=10;
        }
        return addDigits(rem);
    }
}
