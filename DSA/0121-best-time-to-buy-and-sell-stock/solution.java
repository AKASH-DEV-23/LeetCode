class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = Integer.MAX_VALUE;
        for (int num : prices) {
            if (num < buy) {
                buy = num;
            } else{
               int profit=num-buy;
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}
