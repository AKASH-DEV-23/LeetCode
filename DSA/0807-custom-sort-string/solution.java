class Solution {
    public String customSortString(String order, String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder ans= new StringBuilder();
        for(int i=order.length()-1;i>=0;i--){
            char ch=order.charAt(i);
            while(freq[ch-'a']>0){
                ans.append(ch+"");
                freq[ch-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            int cnt=freq[i];
            char ch=(char)('a'+i);
            while(cnt>0){
                ans.append(ch);
                cnt--;
            }
        }
        return ans.reverse().toString();
    }
}
