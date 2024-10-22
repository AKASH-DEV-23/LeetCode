class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            } else if (map.containsKey(s.charAt(i))) {
                char c = map.get(ch);
                if (c != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
