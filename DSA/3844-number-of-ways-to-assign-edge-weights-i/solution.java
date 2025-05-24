class Solution {
    long MOD = 1000000007L;
    private long power(long b, long e) {
        long ans = 1;
        b %= MOD;
        while (e > 0) {
            if (e % 2 == 1) {
                ans = (ans * b) % MOD;
            }
            b = (b * b) % MOD;
            e /= 2;
        }
        return ans;
    }
    public int assignEdgeWeights(int[][] edges) {
        int k = edges.length + 1;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            if (edge[0] >= 0 && edge[0] <= k && edge[1] >= 0 && edge[1] <= k) {
                adj.get(edge[0]).add(edge[1]);
                adj.get(edge[1]).add(edge[0]);
            }
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visi = new boolean[k + 1];

        if (1 > k) {
            return 0;
        }

        q.offer(1);
        visi[1] = true;

        int maxi = 0;
        int newcurr = 0;

        while (!q.isEmpty()) {
            int lvl = q.size();
            maxi = newcurr;

            for (int i = 0; i < lvl; i++) {
                int u = q.poll();
                for (int v : adj.get(u)) {
                    if (v >= 0 && v <= k && !visi[v]) {
                        visi[v] = true;
                        q.offer(v);
                    }
                }
            }
            newcurr++;
        }

        if (maxi == 0) {
            return 0;
        } else {
            return (int) power(2, maxi - 1);
        }
    }
}

