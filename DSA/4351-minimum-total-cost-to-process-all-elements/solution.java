class Solution {
    private static final long MOD=1000000007L;
    public int minimumCost(int[] nums, int k) {
        long prefixSum=0;
        long maxOps=0;
        long kLong=k;
        for(int x:nums){
            prefixSum+=x;
            if(prefixSum>kLong){
                long ops=(prefixSum-kLong+kLong-1)/kLong;
                    if(ops>maxOps)  maxOps=ops;
            }
        }

        long n=maxOps;
        long totalCost;
        if(n%2!=0) totalCost=(n%MOD)*(((n+1)/2)%MOD)%MOD;
        else  totalCost=((n/2)%MOD)*((n+1)%MOD)%MOD;
        return (int)totalCost;
    }
}
