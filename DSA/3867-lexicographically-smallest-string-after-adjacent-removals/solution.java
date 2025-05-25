class Solution {
    public String lexicographicallySmallestString(String str) {
        int length = str.length();
        boolean[][] canForm = new boolean[length + 1][length + 1];
        for (int i = 0; i <= length; i++) {
            canForm[i][i] = true;
        }
        for (int size = 2; size <= length; size++) {
            for (int start = 0; start + size <= length; start++) {
                int end = start + size;
                for (int mid = start + 1; mid < end; mid++) {
                    if (areNeighbors(str.charAt(start), str.charAt(mid))
                            && canForm[start + 1][mid]
                            && canForm[mid + 1][end]) {
                        canForm[start][end] = true;
                        break;
                    }
                }
            }
        }
        String[] memo = new String[length + 1];
        memo[length] = "";

        for (int pos = length - 1; pos >= 0; pos--) {
            String currentBest = str.substring(pos, pos + 1) + memo[pos + 1];
            for (int next = pos + 1; next < length; next++) {
                if (areNeighbors(str.charAt(pos), str.charAt(next)) && 
                    canForm[pos + 1][next]) {
                    if (memo[next + 1].compareTo(currentBest) < 0) {
                        currentBest = memo[next + 1];
                    }
                }
            }
            if (canForm[pos][length]) {
                currentBest = "";
            }
            memo[pos] = currentBest;
        }
        return memo[0];
    }
    private boolean areNeighbors(char x, char y) {
        int difference = Math.abs(x - y);
        return difference == 1 || (x == 'a' && y == 'z') || (x == 'z' && y == 'a');
    }
}

