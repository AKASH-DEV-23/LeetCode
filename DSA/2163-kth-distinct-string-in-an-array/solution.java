class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int c = 0;
        for (String s : arr) {
            int i = map.get(s);
            if (i == 1) {
                c++;
                if (c == k) {
                    return s;
                }
            }

        }
        return "";
    }
}
