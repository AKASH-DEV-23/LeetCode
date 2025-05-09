class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        int len1=name.length();
        int len2=typed.length();
        if(len1>len2)   return false;
        while(i<len1 && j<len2){
            int cnt1=0;
            int cnt2=0;
            char ch1=name.charAt(i);
            char ch2=typed.charAt(j);
            while(i<len1 && name.charAt(i)==ch1){
                cnt1++;
                i++;
            }
            while(j<len2 && typed.charAt(j)==ch2){
                cnt2++;
                j++;
            }
            if(cnt1>cnt2 || ch1 != ch2) return false;
        }
        if(j<len2 || i<len1)    return false;
        return true;
    }
}
