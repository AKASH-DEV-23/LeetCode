class Solution {
    public int maxDistinct(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int cnt=0;
        for(int num:freq){
            if(num!=0)  cnt++;
        }
        return cnt;
    }
}
