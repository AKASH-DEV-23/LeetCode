class Solution {
    public String maximumXor(String s, String t) {
        int len=s.length();
        Boolean[] vis=new Boolean[len];
        int tOne=0;
        for(char ch:t.toCharArray()){
            if(ch=='1')  tOne++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='0' && tOne>0){
                sb.append('1');
                vis[i]=true;
                tOne--;
            }else{
                sb.append(s.charAt(i));
            }
        }
        for(int i=sb.length()-1;i>=0;i--){
            if(tOne>0 && (vis[i]==null)){
                char temp=sb.charAt(i);
                if(temp=='1')  sb.setCharAt(i,'0');
                else  sb.setCharAt(i,'1');
                tOne--;
            }
            if(tOne==0)  break;
        }
        return sb.toString();
    }
}
