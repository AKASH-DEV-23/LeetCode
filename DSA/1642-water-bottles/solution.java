class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles >= numExchange){
            int newBottles=numBottles/numExchange;
            ans += newBottles;
            int remainingBottle=numBottles % numExchange;
            numBottles = newBottles + remainingBottle;
        }
        return ans;
    }
}
