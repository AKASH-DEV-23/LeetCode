class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s=sentence.split(" ");
        for(int i=0; i < s.length;i++){
            String str=s[i];
            if(str.startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}
