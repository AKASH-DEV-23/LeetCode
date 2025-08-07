class Solution {
    public int maxVowels(String s, int k) {
        int maxcnt=0;
        int cnt=0;
        Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                cnt++;
            }
        }
        maxcnt=cnt;
        for(int i=k;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                cnt++;
            }
            if(set.contains(s.charAt(i-k))){
                cnt--;
            }
            maxcnt=Math.max(cnt,maxcnt);
        }
        return maxcnt;
    }
}
