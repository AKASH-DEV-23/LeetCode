class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0;
        for(int num:costs){
            if(num<=coins){
                coins-=num;
                cnt++;
            }
        }
        return cnt;
    }
}
