class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        int MOD=1000000007;
        long swap=0;
        long cnt1=0;
        long cnt2=0;
        for(int val:nums){
            if(val<a){
                swap+=cnt1+cnt2;
            }else if(val>b){
                cnt2++;
            }else{
                swap+=cnt2;
                cnt1++;
            }
        }
        return (int)(swap%MOD);
    }
}
