import java.util.*;

class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        if (k == 0) {
            int V1 = edges1.length + 1;
            int[] ans = new int[V1];
            Arrays.fill(ans, 1);
            return ans;
        }
        
        Map<Integer, List<Integer>> map1 = new HashMap<>();
        Map<Integer, List<Integer>> map2 = new HashMap<>();
        int V1 = edges1.length + 1;
        int V2 = edges2.length + 1;
        for (int i = 0; i < V1; i++) {
            map1.put(i, new ArrayList<>());
        }
        for (int i = 0; i < V2; i++) {
            map2.put(i, new ArrayList<>());
        }
        for (int[] edge : edges1) {
            int u = edge[0];
            int v = edge[1];
            map1.get(u).add(v);
            map1.get(v).add(u);
        }
        for (int[] edge : edges2) {
            int u = edge[0];
            int v = edge[1];
            map2.get(u).add(v);
            map2.get(v).add(u);
        }
        int[] count1 = new int[V1];
        for (int i = 0; i < V1; i++) {
            count1[i] = BFS(map1, i, k).size();
        }
        int maxCount2 = 0;
        int[] count2 = new int[V2];
        for (int i = 0; i < V2; i++) {
            count2[i] = BFS(map2, i, k - 1).size();
            if (count2[i] > maxCount2) {
                maxCount2 = count2[i];
            }
        }
        int[] ans = new int[V1];
        for (int i = 0; i < V1; i++) {
            ans[i] = count1[i] + maxCount2;
        }
        return ans;
    }
    private Set<Integer> BFS(Map<Integer, List<Integer>> map, int vertex, int k) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.offer(vertex);
        visited.add(vertex);
        int distance = 0;
        while (!q.isEmpty() && distance < k) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                int u = q.poll();
                for (int v : map.getOrDefault(u, Collections.emptyList())) {
                    if (!visited.contains(v)) {
                        visited.add(v);
                        q.offer(v);
                    }
                }
            }
            distance++;
        }
        return visited;
    }
}