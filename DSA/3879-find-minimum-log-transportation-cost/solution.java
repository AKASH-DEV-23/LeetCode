class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long cnt1 = Long.MAX_VALUE;
        long cnt2 = Long.MAX_VALUE;
        if (n <= k && m <= k) {
            return 0;
        }
        if (n <= k) {
            if (m > k) {
                int b = m - k;
                cnt2 = (long) b * k;
            }
        }
        if (m <= k) {
            if (n > k) {
                int a = n - k;
                cnt1 = (long) a * k;
            }
        }
        long sum = Math.min(cnt1, cnt2);
        return sum;
    }
}

