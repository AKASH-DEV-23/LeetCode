class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        for(int i=0;i<n;i++){
            int num=prices[i];
            for(int j=i+1;j<n;j++){
                if(num>=prices[j]){
                    prices[i]=Math.abs(num-prices[j]);
                    break;
                }
            }
        }
        return prices;
    }
}
