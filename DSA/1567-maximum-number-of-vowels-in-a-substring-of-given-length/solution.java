class Solution {
    public int maxVowels(String s, int k) {
        int maxcnt=0;
        int cnt=0;
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
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
