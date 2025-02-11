class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cnt1=new int[26];
        int[] cnt2=new int[26];

        for(char ch : s.toCharArray()){
            cnt1[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            cnt2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(cnt1[i] != cnt2[i]){
                return false;
            }
        }
        return true;
    }
}