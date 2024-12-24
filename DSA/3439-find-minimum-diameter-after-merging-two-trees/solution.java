class Solution {
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        int d1 = getDiameter(edges1);
        int d2 = getDiameter(edges2);
        return Math.max(Math.max(d1 - 1, d2 - 1), d1 / 2 + d2 / 2 + 1);
    }
    private int getDiameter(int[][] edges) {
        List<List<Integer>> map = new ArrayList<>();
        for (int i = 0; i < edges.length + 1; i++) {
            map.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int i = edge[0];
            int j = edge[1];
            map.get(i).add(j);
            map.get(j).add(i);
        }
        int[] res = { 0 };
        dfs(0, -1, map, res);
        return res[0];
    }
    private int dfs(int node, int parent, List<List<Integer>> map, int[] res) {
        int maxDepth = 1;
        for (int neighbor : map.get(node)) {
            if (neighbor == parent)
                continue;
            int depth = dfs(neighbor, node, map, res);
            res[0] = Math.max(res[0], maxDepth + depth);
            maxDepth = Math.max(maxDepth, 1 + depth);
        }
        return maxDepth;
    }
}
