class Solution {
    public int maximum69Number (int num) {
       String str=num+"";
       char ch[]=str.toCharArray();
       for(int i=0;i<ch.length;i++){
            if(ch[i]=='6'){
                ch[i]='9';
                break;
            }
       }
       int ans=0;
       for(char che:ch){
        ans=ans*10+(che-'0');
       }
       return ans;
    }
}
