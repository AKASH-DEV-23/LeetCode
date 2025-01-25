class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash=new int[26];
        int i=0;
        int j=0;
        int n=s.length();
       int maxFreq=0;
       int maxLen=0;

        while(j<n){
            char ch =s.charAt(j);
            hash[ch-'A']++;
            maxFreq=Math.max(maxFreq,hash[ch-'A']);
            if((j-i+1)-maxFreq>k){
                hash[s.charAt(i)-'A']--;
                i++;
            }
            if((j-i+1)-maxFreq<=k){
                maxLen=Math.max(maxLen,j-i+1);
            }
            j++;
        }
        return maxLen;
    }
}
