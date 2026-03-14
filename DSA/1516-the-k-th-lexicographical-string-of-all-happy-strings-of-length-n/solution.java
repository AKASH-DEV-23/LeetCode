class Solution {
    String ans="";
    int cnt=0;
    public String getHappyString(int n, int k) {
        solve(new StringBuilder(),n,k);
        return ans;
    }

    private void solve(StringBuilder sb, int n, int k){
        if(n==0){
            cnt++;
            if(cnt==k){
                ans=sb.toString();
            }
            return;
        }
        for(int i=0;i<=2;i++){
            if(sb.length()>0 && sb.charAt(sb.length()-1)==(char)('a'+i))    continue;
            sb.append((char)('a'+i));
            solve(sb,n-1,k);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}




