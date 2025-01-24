class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] set=new int[256];
        Arrays.fill(set,-1);
        int l=0;
        int r=0;
        int max=0;
        int n=s.length();
        while(r<n){
            char ch=s.charAt(r);
            if(set[ch]!=-1){
                if(set[ch]>=l){
                    l=set[ch]+1;
                }
            }
            max=Math.max(max,r-l+1);
            set[ch]=r;
            r++;
        }
        return max;
    }
}
