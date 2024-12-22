class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
          int n = heights.length;
        int totalQueries = queries.length;
        int[] ans = new int[totalQueries];
        Arrays.fill(ans, -1);
        Map<Integer, List<int[]>> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for (int q = 0; q < totalQueries; q++) {
            int i = queries[q][0];
            int j = queries[q][1];
            if (i < j && heights[i] < heights[j]) {
                ans[q] = j;
            } else if (i > j && heights[i] > heights[j]) {
                ans[q] = i;
            } else if (i == j) {
                ans[q] = i;
            } else {
                map.computeIfAbsent(Math.max(i, j), k -> new ArrayList<>()).add(new int[]{Math.max(heights[i], heights[j]), q});
            }
        }
        for (int i = 0; i < n; i++) {
            while (!pq.isEmpty() && pq.peek()[0] < heights[i]) {
                int queryIndex = pq.poll()[1];
                ans[queryIndex] = i;
            }
            if (map.containsKey(i)) {
                for (int[] entry : map.get(i)) {
                    pq.offer(entry);
                }
            }
        }

        return ans;
    }
}
