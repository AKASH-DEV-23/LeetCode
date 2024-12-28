class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=rocks.length;
        for(int i=0;i<n;i++){
            rocks[i]=capacity[i]-rocks[i];
        }

        Arrays.sort(rocks);
        int cnt=0;
        for(int i=0;i<n;i++){
            if(additionalRocks>=rocks[i]){
                additionalRocks-=rocks[i];
                cnt++;
            }else{
                return cnt;
            }
        }
        return cnt;
    }
}
