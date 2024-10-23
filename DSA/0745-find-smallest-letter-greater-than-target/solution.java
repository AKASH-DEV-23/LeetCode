class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            int n = (int) (c - target);
            if (n > 0) {
                return c;
            }
        }
        return letters[0];
    }
}
