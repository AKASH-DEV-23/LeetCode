class Solution {
   public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i < 2) {
                sum += prices[i];
            }
        }
        int result = money - sum;
        return (result >= 0) ? result : money;
    }
}
