class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxi=0;
        for(int num:prices){
            if(num<buy){
                buy=num;
            }else{
                maxi=Math.max(maxi,num-buy);
            }
        }
        return maxi;
    }
}
