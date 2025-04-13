class Solution {
    public String smallestPalindrome(String s) {
        int[] count=new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        StringBuilder sb1=new StringBuilder();
        StringBuilder middle=new StringBuilder();
        for(int i=0;i<26;i++){
            if(count[i]%2==1){
                char mid=(char)('a'+i);
                middle.append(mid);
            }
            int cnt=count[i]/2;
            char ch=(char)('a'+i);
            while(cnt>0){
                sb1.append(ch);
                    cnt--;
            }
        }
        
        return sb1.toString() + middle.toString() + sb1.reverse().toString();
    }
}
