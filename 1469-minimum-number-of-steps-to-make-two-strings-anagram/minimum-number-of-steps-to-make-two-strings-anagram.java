class Solution {
    public int minSteps(String s, String t) {
        int[] cnt1=new int[26];
        int[] cnt2= new int[26];

        for(char ch:s.toCharArray()){
            cnt1[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            cnt2[ch-'a']++;
        }

        int minCnt=0;
        for(int i=0;i<26;i++){
            if(cnt1[i]>cnt2[i]){
                minCnt+=cnt1[i]-cnt2[i];
            }
        }
        return minCnt;
    }
}