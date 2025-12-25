class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        long ans =0;
        int cnt=0;
        for(int i=n-1;i>=0;i--){
            if(k==0) break;
            k--;
            if((happiness [i]-cnt)>0){
                ans+=(happiness[i]-cnt);
            } 
            cnt++;
        }
        return ans;
    }
}
