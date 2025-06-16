class Solution {
    public boolean buddyStrings(String s, String goal) {
        int cnt=0;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char ch:s.toCharArray())    freq1[ch-'a']++;
        for(char ch:goal.toCharArray())    freq2[ch-'a']++;
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i])  return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) !=goal.charAt(i))    cnt++;
            if(cnt>2)   return false;
        }
        if(cnt==2) return true;
        if(cnt==0){
            int[] arr=new int[26];
            for(char ch:s.toCharArray())    arr[ch-'a']++;
            for(int num:arr){
                if(num>=2)  return true;
            }
        }
        return false;
    }
}
