class Solution {
    public int maxProduct(int n) {
        int fir=0;
        int sec=0;
        while(n!=0){
            int rem=n%10;
            n/=10;
            if(rem>fir){
                sec=fir;
                fir=rem;
            }else if(rem>sec){
                sec=rem;
            }
        }
        return fir*sec;
    }
}
