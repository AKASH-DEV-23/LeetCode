class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, count = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                java.util.ArrayDeque<Integer> q = new java.util.ArrayDeque<>();
                q.offer(i);
                visited[i] = true;

                while (!q.isEmpty()) {
                    int u = q.poll();
                    for (int v = 0; v < n; v++) {
                        if (isConnected[u][v] == 1 && !visited[v]) {
                            visited[v] = true;
                            q.offer(v);
                        }
                    }
                }
            }
        }
        return count;
    }
}
