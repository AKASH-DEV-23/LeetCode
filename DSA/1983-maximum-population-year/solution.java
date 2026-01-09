class Solution {
    int cnt=0;
    public int maximumPopulation(int[][] logs) {
        int ans=1950;
        for(int i=1950;i<=2050;i++){
            if(solve(i,logs))   ans=i;
        }
        return ans;
    }

    private boolean solve(int year, int[][] logs){
        int sum=0;
        for(int[] dura : logs){
            if(dura[0]<=year && dura[1]>year){
                sum++;
            }
        }
        if(cnt<sum){
            cnt=sum;
            return true;
        }
        return false;
    }
}
