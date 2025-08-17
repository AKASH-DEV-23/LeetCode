class Solution {
    final static long MOD=Long.MIN_VALUE/4;
    public long minArraySum(int[] nums, int k) {
        long s=0;
        for(int x:nums)  s+=x;
        int n=nums.length;
        Map<Integer,Long> mp=new HashMap<>();
        mp.put(0,0L);
        long p=0;
        long d=0;
        for(int i=0;i<n;i++){
            p+=nums[i];
            int r=(int)((p%k+k)%k);
            long c=MOD;
            if(mp.containsKey(r))  c=p+mp.get(r);
            long t=d;
            if(c>t)  t=c;
            long b=t-p;
            mp.put(r,Math.max(mp.getOrDefault(r,MOD),b));
            d=t;
        }
        return s-d;
    }
}
