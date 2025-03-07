class Solution {
    public boolean validPalindrome(String s) {
        int st=0;
        int end = s.length()-1;
        boolean flag=true;
        while(st<end){
            if(s.charAt(st)==s.charAt(end)){
                st++;
                end--;
            }else {
                flag = helper(s,st+1,end) || helper(s,st,end-1);
                break;
            }
        }
        return flag;
    }
    private boolean helper(String s, int st, int end){
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}