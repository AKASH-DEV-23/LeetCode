class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        Integer[] a = Arrays.stream(count).boxed().toArray(Integer[]::new);
        Arrays.sort(a, Comparator.reverseOrder());
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += a[i] * ((i / 8) + 1);
        }
        return ans;
    }
}
