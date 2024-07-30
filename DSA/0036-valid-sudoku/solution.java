class Solution {
    public static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    continue;
                }
                char c = board[row][col];
                if (!set.add(c + "in row" + row) ||
                        !set.add(c + "in col" + col) ||
                        !set.add(c + "in box" + row / 3 + "_" + col / 3)) {
                    return false;
                }
            }
        }
        return true;
    }
}
