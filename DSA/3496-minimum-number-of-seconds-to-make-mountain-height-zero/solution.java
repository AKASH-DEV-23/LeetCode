class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int len=workerTimes.length;
        Arrays.sort(workerTimes);
        long naturalSum=(long)mountainHeight*mountainHeight+1/2;
        long high=(long)(workerTimes[len-1]*naturalSum);
        long low=1;
        long res=high;
        while(low<=high){
            long mid=(long)low+(high-low)/2;
            if(solve(workerTimes,mountainHeight,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }

    private boolean solve(int[] workerTimes, int mountainHeight, long mid){
        long totalWork=0;
        for(int time:workerTimes){
            totalWork+=Math.sqrt(0.25+2*mid/time)-0.5;
            if(totalWork>=mountainHeight)   return true;
        }
        return false;
    }
}
