class Solution {
    public int maxFreqSum(String s) {
        int[] count=new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        int vowel=0;
        int con=0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                vowel=Math.max(count[i],vowel);
            }else{
                con=Math.max(con,count[i]);
            }
        }
        return vowel+con;
    }
}
