class Solution {
    public long maxProfit(int[] p, int[] s, int k) {
        int n=p.length;
        if(n==0)  return 0L;
        long ip=0;
        for(int i=0;i<n;i++){
            ip+=(long)s[i]*p[i];
        }
        if(k==0 || k>n)  return ip;
        long[] co=new long[n+1];
        long[] cp=new long[n+1];
        for(int i=0;i<n;i++){
            co[i+1]=co[i]+(long)s[i]*p[i];
            cp[i+1]=cp[i]+p[i];
        }
        long mg=0;
        int hk=k/2;
        for(int i=0;i<=n-k;i++){
            long os=co[i+k]-co[i];
            long ns=cp[i+k]-cp[i+hk];
            long cg=ns-os;
            mg=Math.max(mg,cg);
        }
        return ip+mg;
    }
}
