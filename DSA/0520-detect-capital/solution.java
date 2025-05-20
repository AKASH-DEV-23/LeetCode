class Solution {
    public boolean detectCapitalUse(String word) {
        int x=0;
        int y=0;
        int z=0;
        int n=word.length();
        for(char ch:word.toCharArray()){
            if(ch>='a' && ch <='z')     x++;
            if(ch>='A' && ch<='Z')      y++;
        }
        if(x==n)    return true;
        if(y==n)    return true;
        for(int i=1;i<n;i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z')      return false;
        }
        return  true ;
    }
}
