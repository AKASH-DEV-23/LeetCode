class Solution {
    public boolean canTransform(String start, String target) {
        int i=0;
        int j=0;
        char[] st = start.toCharArray();
        char[] tar = target.toCharArray();
        while(i<start.length() || j<target.length()){
            while(i<st.length && st[i]=='X')   i++;
            while(j<tar.length && tar[j]=='X')   j++;
            if(i==st.length || j==tar.length)   return i==st.length && j==tar.length;
            if(st[i] != tar[j]) return false;
            if(st[i]=='L' && i<j){
                return false;
            }
            if(st[i]=='R' && i>j){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}