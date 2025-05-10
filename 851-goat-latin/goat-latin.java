class Solution {
    public String toGoatLatin(String sentence) {
        String[] str=sentence.split(" ");
        for(int i=0;i<str.length;i++){
            String s=str[i];
            if(isVowel(s)){
                s=s+"ma";
                int cnt=i;
                while(cnt>=0){
                    s=s+"a";
                    cnt--;
                }
                str[i]=s;
            }else{
                char ch=s.charAt(0);
                s=s.substring(1);
                s=s+ch;
                s=s+"ma";
                int cnt=i;
                while(cnt>=0){
                    s=s+"a";
                    cnt--;
                }
                str[i]=s;
            }
        }
        String ans="";
        for(String s:str){
            ans=ans+s+" ";
        }
        return ans.trim();
    }
    private boolean isVowel(String s){
        char ch=s.charAt(0);
        if(ch=='A' || ch== 'E' || ch =='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || 
        ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }
}