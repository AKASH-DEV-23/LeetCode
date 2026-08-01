import java.util.*;

class Solution {
        public long minInitialStrength(int[] monsters, int[][] boosts) {
            int n = monsters.length;

            long[] diff = new long[n + 1];
            for (int[] b : boosts) {
                int l = b[0], r = b[1], v = b[2];
                diff[l] += v;
                if (r + 1 < n) diff[r + 1] -= v;
            }

            long[] bonus = new long[n];
            long curBonus = 0;
            for (int i = 0; i < n; i++) {
                    curBonus += diff[i];
                    bonus[i] = curBonus;
            }

            long lo = 0, hi = 0;
            for (int x : monsters) hi += x;

            while (lo < hi) {
                long mid = lo + (hi - lo) / 2;
                if (canDefeat(mid, monsters, bonus)) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }

            return lo;
        }

        private boolean canDefeat(long initial, int[] monsters, long[] bonus) {
            long strength = initial;

            for (int i = 0; i < monsters.length; i++) {
                if (strength + bonus[i] < monsters[i]) {
                                    return false;
                }

                strength -= monsters[i];
                if (strength < 0) strength = 0;
            }

                return true;
        }
}
