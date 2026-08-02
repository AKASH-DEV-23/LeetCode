class Solution {
    public long maxPairStrength(int[] nums) {
            long ans = 0;
            int n = nums.length;
            for (int i=0;i < n; i++) {
                for (int j = i + 1;j< n; j++) {
                    long g = gcd(nums[i], nums[j]);
                    long val = ((long) nums[i] / g) * ((long) nums[j] / g);          
                    if (val > ans) ans = val;
                }
            }
            return ans;
        }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

}
