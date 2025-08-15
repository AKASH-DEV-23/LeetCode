class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int[] freq=new int[26];
        for(char ch:s.toCharArray())    freq[ch-'a']++;
        int[] freq2=new int[26];
        for(char ch:goal.toCharArray()) freq2[ch-'a']++;
        for(int i=0;i<26;i++)   if(freq[i] != freq2[i]) return false;
        boolean isEven=false;
        for(int temp:freq)  if(temp>=2) isEven=true;
        if(s.equals(goal) && isEven)    return true;
        int maxDiff=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != goal.charAt(i))   maxDiff++;
        }
        return maxDiff==2 ? true : false;
    }
}
