class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int[] freq=new int[26];
        for(char ch:s.toCharArray())    freq[ch-'a']++;
        int odd=-1;
        for(int i=0;i<26;i++){
            int cnt=freq[i];
            if(cnt%2==0){
                cnt>>=1;
                while(cnt>0){
                    sb.append((char)('a'+i));
                    cnt--;
                }
            }else{
                cnt>>=1;
                while(cnt>0){
                    sb.append((char)('a'+i));
                    cnt--;
                }
                odd=i;
            }
        }
        StringBuilder rev=new StringBuilder();
        rev.append(sb);
        if(odd!=-1)
            rev.append((char)('a'+odd));
        rev.append(sb.reverse());
        return rev.toString();
    }
}
