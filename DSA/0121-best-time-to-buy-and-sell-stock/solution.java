class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int n=prices.length;
        int buy=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }else{
                maxi=Math.max(maxi,prices[i]-buy);
            }
        }
        return maxi;
    }
}
