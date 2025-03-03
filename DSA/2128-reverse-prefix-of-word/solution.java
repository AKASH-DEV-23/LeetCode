class Solution {
    public String reversePrefix(String word, char ch) {
        char[] freq=word.toCharArray();
        for(int i=0;i<freq.length;i++){
            if(freq[i]==ch){
                reverse(freq,0,i);
                break;
            }
        }
        return new String(freq);
    }
    private void reverse(char[] freq, int i, int j){
        while(i<=j){
            char temp=freq[i];
            freq[i]=freq[j];
            freq[j]=temp;
            i++;
            j--;
        }
    }
}
