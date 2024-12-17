class Solution {
    public int maxPower(String s) {
        int max=1;
        int cnt=1;
        for(int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            if(s.charAt(i-1)!=curr){
                max=Math.max(cnt,max);
                cnt=1;
            }else{
                cnt++;
            }
        }
        return Math.max(max,cnt);
    }
}
