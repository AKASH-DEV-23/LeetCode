class Solution {
    public long sumAndMultiply(int n) {
        long concat=0;
        int num=n;
        long sum=0;
        int p=1;
        while(num!=0){
            int rem=num%10;
            
            if(rem!=0){
                concat=rem*p+concat;
                p*=10;
            }
            sum+=rem;
            num/=10;
        }
        return sum*concat;
    }
}
