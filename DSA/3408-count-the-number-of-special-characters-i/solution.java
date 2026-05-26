class Solution {
    public int numberOfSpecialChars(String word) {
        int[] ascii=new int[128];
        for(char ch:word.toCharArray()){
            ascii[ch]++;
        }

        int cnt=0;
        for(int i=65;i<97;i++){
            if(ascii[i]>0 && ascii[i+32]>0){
                cnt++;
            }
        }
        return cnt;
    }
}
