class Solution {
    private static final int MOD = (int)10e8 + 7;
    public int countPalindromes(String s) {
        int n = s.length();
        long numPalindromes = 0;
        int[][] leftPairs = new int[n][100];
        int[][] rightPairs = new int[n][100];
        int[] digitCount = new int[10];
        int[] currPairs = new int[100];
        for (int i = 0; i < n - 2; i++) {
            int digit = s.charAt(i) - '0';
            for (int j = 0; j < 10; j++)
                currPairs[j * 10 + digit] = (currPairs[j * 10 + digit] + digitCount[j]) % MOD;

            digitCount[digit]++;
            leftPairs[i + 1] = Arrays.copyOf(currPairs, 100);
        }
        digitCount = new int[10]; currPairs = new int[100];
        for (int i = n - 1; i > 1; i--) {
            int digit = s.charAt(i) - '0';

            for (int j = 0; j < 10; j++)
                currPairs[j * 10 + digit] = (currPairs[j * 10 + digit] + digitCount[j]) % MOD;

            digitCount[digit]++;
            rightPairs[i - 1] = Arrays.copyOf(currPairs, 100);
        }
        for (int i = 2; i < n - 2; i++)
            for (int j = 0; j < 100; j++)
                numPalindromes = (numPalindromes + (long)leftPairs[i][j] * rightPairs[i][j]) % MOD;
                
        return (int)numPalindromes;
    }
}
