class Solution {
    private static class Pair {
        int tar;
        long fact;
        Pair(int tar, long fact) {
            this.tar=tar;
            this.fact=fact;
        }
    }
    private List<List<Pair>> adj;
    private long[] basi;
    private final long MOD=1000000007;

    public int[] baseUnitConversions(int[][] conversions) {
        int n=conversions.length + 1;
        if(n==1){
            return new int[]{1};
        }
        adj=new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for (int[] conv:conversions) {
            int u=conv[0];
            int v=conv[1];
            long fact=conv[2];
             if(u>=0 && u<n){
                 adj.get(u).add(new Pair(v, fact));
             }
        }
        basi=new long[n];
        dfs(0, 1L);
        int[] res=new int[n];
        for (int i=0; i<n; i++) {
            res[i]=(int) basi[i];
        }
        return res;
    }

    private void dfs(int u, long curr) {
        basi[u]=curr;
        if (adj.get(u)!=null) {
            for (Pair edge:adj.get(u)) {
                int v=edge.tar;
                long edgeFactor=edge.fact;
                long nextFactor=(curr * edgeFactor) % MOD;
                dfs(v, nextFactor);
            }
        }
    }
}
