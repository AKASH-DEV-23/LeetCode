import java.util.*;

class Solution {
    public int maximumWidth(int[] planks) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int h : planks) {
            freq.put(h, freq.getOrDefault(h, 0) + 1);
        }

        Map<Integer, Integer> pairCount = new HashMap<>();

        List<Integer> values = new ArrayList<>(freq.keySet());
        int m = values.size();

        for (int i = 0; i < m; i++) {
            int a = values.get(i);
            int fa = freq.get(a);

            if (fa >= 2) {
                int sum = a + a;
                pairCount.put(sum, pairCount.getOrDefault(sum, 0) + fa / 2);
            }

            for (int j = i + 1; j < m; j++) {
                int b = values.get(j);
                int fb = freq.get(b);

                int sum = a + b;
                pairCount.put(sum, pairCount.getOrDefault(sum, 0) + Math.min(fa, fb));
            }
        }

        int ans = 1;

        for (int h : values) {
            ans = Math.max(ans, freq.get(h));
        }

        for (Map.Entry<Integer, Integer> e : pairCount.entrySet()) {
            int height = e.getKey();
            int width = e.getValue() + freq.getOrDefault(height, 0);
            ans = Math.max(ans, width);
        }

        return ans;
    }
}
