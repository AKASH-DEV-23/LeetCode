class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray())    freq[ch-'a']++;
        int i=0;
        for(char ch:s.toCharArray()){
            if(freq[ch-'a']==1) return i;
            i++;
        }
        return -1;
    }
}
