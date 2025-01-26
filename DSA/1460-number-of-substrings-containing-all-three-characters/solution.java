class Solution {
    public int numberOfSubstrings(String s) {
        int cnt=0;
        int[] lastSeen={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            lastSeen[ch-'a']=i;
            cnt+=1+Math.min(lastSeen[2],Math.min(lastSeen[0],lastSeen[1]));
        }
        return cnt;
    }
}
