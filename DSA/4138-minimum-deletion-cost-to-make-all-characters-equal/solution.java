class Solution {
    public long minCost(String s, int[] cost) {
        long[] arr=new long[26];
        int idx=0;
        for(char ch:s.toCharArray()){
            arr[ch-'a']+=cost[idx++];
        }
        long sum=0;
        for(long num:cost){
            sum+=num;
        }
        long ans=Long.MAX_VALUE;
        for(long temp:arr){
            ans=(long)Math.min(ans,sum-temp);
        }
        return ans;
    }
}
