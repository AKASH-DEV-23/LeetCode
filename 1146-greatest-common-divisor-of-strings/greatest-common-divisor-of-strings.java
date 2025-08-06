class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String sb="";
        String temp=str1.length()<str2.length()?str1:str2;
        String ans="";
        for(int i=0;i<temp.length();i++){
            sb=sb+temp.charAt(i);
            if(check(str1,sb) && check(str2,sb)){
                ans=sb;
            }
        }
        return ans;
    }
    private boolean check(String str, String temp){
        if(temp.length()>str.length())  return false;
        int j=0;
        int i=0;
        for(i=0;i<str.length();i++){
            if(j==temp.length())    j=0;
            if(str.charAt(i)!=temp.charAt(j))   return false;
            j++;
        }
        if(i==str.length() && j==temp.length())    return true;
        return false;
    }
}