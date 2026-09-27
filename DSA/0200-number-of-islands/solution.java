class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;

        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    islands++;
                    java.util.ArrayDeque<int[]> queue = new java.util.ArrayDeque<>();
                    queue.offer(new int[]{r, c});
                    grid[r][c] = '0';

                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();

                        for (int[] dir : dirs) {
                            int nr = cell[0] + dir[0];
                            int nc = cell[1] + dir[1];

                            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                                    && grid[nr][nc] == '1') {
                                grid[nr][nc] = '0';
                                queue.offer(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
        }

        return islands;
    }
}
