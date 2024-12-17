class Solution {
    public boolean makeEqual(String[] words) {
        int[] count=new int[26];
        int len=words.length;
        for(int i=0;i<words.length;i++){
            for(char ch:words[i].toCharArray()){
                count[ch-'a']++;
            }
        }
        // System.out.print(Arrays.toString(count));
        for(int num:count){
           if(num%len!=0){
            return false;
           }
        }
        return true;
    }
}
