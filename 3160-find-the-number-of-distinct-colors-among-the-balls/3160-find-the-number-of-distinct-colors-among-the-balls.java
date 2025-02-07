import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int[] distinctCount = new int[queries.length];
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> colorCount = new HashMap<>(); 
        Set<Integer> set = new HashSet<>(); 

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            if (map.containsKey(ball)) {
                int oldColor = map.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if (colorCount.get(oldColor) == 0) {
                    set.remove(oldColor);
                }
            }

            map.put(ball, color);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
            set.add(color);

            distinctCount[i] = set.size();
        }
        return distinctCount;
    }
}
