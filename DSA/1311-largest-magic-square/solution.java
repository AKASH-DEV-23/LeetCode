import java.util.*;

class Solution {
    public int largestMagicSquare(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        long[][] rowPrefix = new long[row][col];
        long[][] colPrefix = new long[row][col];

        for (int i = 0; i < row; i++) {
            rowPrefix[i][0] = grid[i][0];
            for (int j = 1; j < col; j++) {
                rowPrefix[i][j] = rowPrefix[i][j - 1] + grid[i][j];
            }
        }

        for (int j = 0; j < col; j++) {
            colPrefix[0][j] = grid[0][j];
            for (int i = 1; i < row; i++) {
                colPrefix[i][j] = colPrefix[i - 1][j] + grid[i][j];
            }
        }

        int side = Math.min(row, col);

        while (side > 0) {
            for (int i = 0; i + side <= row; i++) {
                for (int j = 0; j + side <= col; j++) {
                    if (isValid(side, i, j, rowPrefix, colPrefix, grid)) {
                        return side;
                    }
                }
            }
            side--;
        }
        return 1;
    }

    private boolean isValid(int side, int i, int j,
                            long[][] rowPrefix, long[][] colPrefix,
                            int[][] grid) {

        Set<Long> vis = new HashSet<>();

        for (int x = i; x < i + side; x++) {
            long sum = (j == 0)
                    ? rowPrefix[x][j + side - 1]
                    : rowPrefix[x][j + side - 1] - rowPrefix[x][j - 1];
            vis.add(sum);
        }

        for (int y = j; y < j + side; y++) {
            long sum = (i == 0)
                    ? colPrefix[i + side - 1][y]
                    : colPrefix[i + side - 1][y] - colPrefix[i - 1][y];
            vis.add(sum);
        }

        long leftDia = 0;
        long rightDia = 0;

        for (int k = 0; k < side; k++) {
            leftDia += grid[i + k][j + k];
            rightDia += grid[i + k][j + side - 1 - k];
        }

        vis.add(leftDia);
        vis.add(rightDia);

        return vis.size() == 1;
    }
}

