class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            sb.append(ch);
            if(makeString(s,sb.toString()))    return true;
        }
        return false;
    }
    private boolean makeString(String target, String sb){
        StringBuilder curr=new StringBuilder();
        while(curr.length() <= target.length()){
            curr.append(sb);
            if(target.equals(curr.toString()))  return true;
        }
        return false;
    }
}
