class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int num:prices){
            if(num<buy) buy=num;
            else
                profit=Math.max(profit,num-buy);
        }

        return profit;
    }
}
