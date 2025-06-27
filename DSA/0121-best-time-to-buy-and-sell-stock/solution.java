class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=0;
        for(int num:prices){
            if(num<buy)  buy=num;
            else    maxProfit=Math.max(maxProfit,num-buy);
        }
        return maxProfit;
    }
}
