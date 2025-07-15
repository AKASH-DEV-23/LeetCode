class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        word=word.toLowerCase();
        int vowel=0;
        int cons=0;
        for(char ch:word.toCharArray()){
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }else{
                    cons++;
                }
            }
            else if(ch>='0' && ch<='9')  continue;
            else{
               return false;
            }
        }
        if(vowel==0 || cons==0)    return false;
        return true;
    }
}
