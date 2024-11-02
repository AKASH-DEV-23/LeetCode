class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        String first = arr[0];
        String last = arr[arr.length - 1];
        char ch1 = first.charAt(0);
        char ch2 = last.charAt(last.length() - 1);
        if (ch1 - 'a' != ch2 - 'a') {
            return false;
        }
        char chh2 = first.charAt(first.length()-1);
        for(int i=1;i<arr.length;i++){
            String str = arr[i];
            char c1 = str.charAt(0);
            if(chh2-'a' != c1 -'a'){
                return false;
            }
            chh2=str.charAt(str.length()-1);
        }
        return true;
    }
}
