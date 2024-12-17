class Solution {
    public int compress(char[] chars) {
        int cnt=1;
        StringBuilder sb=new StringBuilder("");
        sb.append(chars[0]);
        for(int i=1;i<chars.length;i++){
            if(chars[i]!=chars[i-1]){
                if(cnt>1){
                    sb.append(cnt);
                    cnt=1;
                }
                sb.append(chars[i]);
            }else{
                cnt++;
            }
        }
        if(cnt>1){
            sb.append(cnt);
        }
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}
