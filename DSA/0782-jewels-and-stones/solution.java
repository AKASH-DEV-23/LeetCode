class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] capital=new int[26];
        int[] small=new int[26];
        for(char ch:stones.toCharArray()){
            if(ch>='A' && ch <='Z') capital[ch-'A']++;
            else small[ch-'a']++;
        }
        int cnt=0;
        for(char ch:jewels.toCharArray()){
            if(ch>='A' && ch<='Z')  cnt+=capital[ch-'A'];
            else cnt+=small[ch-'a'];
        }
        return cnt;
    }
}
