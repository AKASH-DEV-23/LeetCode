class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen=new int[128];
        int left=0;
        int maxResult=0;
        Arrays.fill(lastSeen,-1);

        for(int right=0; right<s.length();right++){
            char currentChar=s.charAt(right);

            if(lastSeen[currentChar]>=left){
                left=lastSeen[currentChar]+1;
            }
            lastSeen[currentChar]=right;
            maxResult=Math.max(maxResult,right-left+1);
        }

        return maxResult;
    }
}
