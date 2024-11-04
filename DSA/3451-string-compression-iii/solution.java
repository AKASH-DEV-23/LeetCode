class Solution {
    public String compressedString(String word) {
        StringBuilder str =new StringBuilder();
        int count=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                count++;
                if(count==9){
                    str.append(count);
                    count=0;
                    str.append(word.charAt(i));
                }
            } else {
                if(count==0){
                    count=1;
                    continue;
                }
                str.append(count);
                count=1;
                str.append(word.charAt(i-1));
            }
        }
        if(count>0){
            str.append(count);
            str.append(word.charAt(word.length()-1));
        }
        return str.toString();
    }
}
