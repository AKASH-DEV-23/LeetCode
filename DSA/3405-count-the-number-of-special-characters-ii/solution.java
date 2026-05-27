class Solution {
    public int numberOfSpecialChars(String word) {
        int[] ascii=new int[128];
        boolean[] caps=new boolean[26];

        for(int i=word.length()-1;i>=0;i--){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z'){
                if(ascii[ch+32]!=0) caps[ch-'A']=true;
            }else{
                ascii[ch]++;
            }
        }
        Arrays.fill(ascii,0);
        boolean[] taken=new boolean[26];
        int cnt=0;
        for(char ch:word.toCharArray()){
            if(ch>='A' && ch<='Z'){
                if(!caps[ch-'A'] && ascii[ch+32]!=0){
                    if(!taken[ch-'A'])  cnt++;
                    taken[ch-'A']=true;
                } 
            }else{
                ascii[ch]++;
            }
            
        }
        return cnt;
    } 
}
