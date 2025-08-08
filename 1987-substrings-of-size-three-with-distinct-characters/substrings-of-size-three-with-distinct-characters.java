class Solution {
    public int countGoodSubstrings(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            int idx=0;
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                idx++;
                if(idx==3)  break;
            }
            System.out.println(sb);
            if(idx==3 && solve(sb.toString()))    cnt++;
        }
        return cnt;
    }
    private boolean solve(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j))    return false;
            }
        }
        return true;
    }
}