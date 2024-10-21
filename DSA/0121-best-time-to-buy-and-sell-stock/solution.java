class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int n : prices) {
            if (n < buyPrice) {
                buyPrice = n;
            } else {
                // int profit = n - buyPrice;
                maxProfit = Math.max(maxProfit, n - buyPrice);
            }
        }
        return maxProfit;
    }
}
