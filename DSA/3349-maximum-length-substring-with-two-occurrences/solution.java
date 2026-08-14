class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int maxLen=0;
        
        int low=0;
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            freq[ch-'a']++;

            while(freq[ch-'a']>2){
                freq[s.charAt(low)-'a']--;
                low++;
            }
            
            maxLen=Math.max(maxLen,high-low+1);
        }

        return maxLen;
    }
}
