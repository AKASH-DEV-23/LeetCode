class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt=0;
        int[] cnt1=new int[26];
        int[] cnt2=new int[26];
        for(int i=0;i<s1.length();i++){
            cnt1[s1.charAt(i)-'a']++;
            cnt2[s2.charAt(i)-'a']++;
            if(s1.charAt(i)!=s2.charAt(i))  cnt++;
        }
        for(int i=0;i<26;i++){
            if(cnt1[i]!=cnt2[i])    return false;
        }
        return cnt<=2;
    }
}