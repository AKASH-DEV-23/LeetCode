class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        
        int tempNum=n;
        while(tempNum!=0){
            int rem=tempNum%10;
            sum+=rem;
            product*=rem;
            tempNum/=10;
        }

        return n%(sum+product)==0;
    }
}
