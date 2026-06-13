class Solution {
    public String longestPalindrome(String s) {
        int left=0;
        int right=0;

        int len=s.length();

        for(int i=0;i<len;i++){

            int len1=expandAroundCenter(s,i,i);

            int len2=expandAroundCenter(s,i,i+1);

            int maxLen=Math.max(len1,len2);

            if(maxLen>(right-left)){
                left=i-(maxLen-1)/2;
                right=i+maxLen/2;
            }
        }

        return s.substring(left,right+1);
    }

    private int expandAroundCenter(String s, int left, int right){

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return right-left-1;
    }
}
