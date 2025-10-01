class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        while(numBottles>=numExchange){
            int bottleToDrink=numBottles/numExchange;
            int temp=numBottles%numExchange;
            drink+=bottleToDrink;
            numBottles=bottleToDrink+temp;
        }
        return drink;
    }
}
