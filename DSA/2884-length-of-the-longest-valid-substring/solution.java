class Solution {
    public int longestValidSubstring(String word, List<String> forbidden) {
        Set<String> forbiddenSet = new HashSet<>(forbidden);
        int maxValidLength = 0;
        int wordLength = word.length();
        for (int i = 0, j = 0; j < wordLength; ++j) {
            for (int k = j; k > Math.max(j - 10, i - 1); --k) {
                if (forbiddenSet.contains(word.substring(k, j + 1))) {
                    i = k + 1;
                    break;
                }
            }
            maxValidLength = Math.max(maxValidLength, j - i + 1);
        }
        return maxValidLength;
    }
}
