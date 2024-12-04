class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int len1=str1.length()-1;
        int len2=str2.length()-1;
        int i=0;
        int j=0;
        while(i<=len1 && j<=len2){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }else if(str1.charAt(i)!=str2.charAt(j)){
                char ch1=str1.charAt(i);
                if(ch1=='z'){
                    ch1='a';
                }else{
                ch1 += 1;
                }
                if(str2.charAt(j)==ch1){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
        }
        return j==len2+1 ? true: false;
    }
}
