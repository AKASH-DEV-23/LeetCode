class Solution {
    public boolean validDigit(int n, int x) {
        String str=n+"";
        if(str.charAt(0)-'0'==x)  return false;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)-'0'==x)  return true;
        }
        return false;
    }
}
