class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        if(n<k) return false;
        if(n==k)    return true;
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int cnt=0;
        for(int num:freq){
            if(num%2!=0)    cnt++;
        }
        return cnt<=k;
    }
}
