class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans=Long.MAX_VALUE;
        ans=Math.min(ans,(long)need1*cost1+(long)need2*cost2);
        ans=Math.min(ans,(long)Math.max(need1,need2)*costBoth);
        if(need1<=need2){
            ans=Math.min(ans,(long)need1*costBoth+(long)(need2-need1)*cost2);
        }else{
            ans=Math.min(ans,(long)need2*costBoth+(long)(need1-need2)*cost1);
        }
        return ans;
    }
}
