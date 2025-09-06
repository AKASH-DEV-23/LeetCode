class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int maxi=0;
        Map<Character, Integer> mp=new HashMap<>();
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(mp.containsKey(ch)){
                i=Math.max(i,mp.get(ch)+1);
            }
            mp.put(ch,j);
            maxi=Math.max(maxi,j-i+1);
        }
        return maxi;
    }
}
