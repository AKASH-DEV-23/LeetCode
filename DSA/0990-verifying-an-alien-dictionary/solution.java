class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] freq=new int[26];
        int n=words.length;
        for(int i=0;i<order.length();i++){
            freq[order.charAt(i)-'a']=i;
        }
        for(int i=1;i<n;i++){
            if(!checkOrder(words[i-1],words[i],freq)){
                return false;
            }
        }
        return true;
    }
    private boolean checkOrder(String s1, String s2, int[] freq){
        int len=Math.min(s1.length(),s2.length());
        for(int i=0;i<len;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(c1!=c2){
                return freq[c1-'a']<freq[c2-'a'];
            }
        }
        return s1.length()<=s2.length();
    }
}
