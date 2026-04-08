class Solution {
    public int mirrorFrequency(String s) {
        int[] freq=new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        int ans=0;
        for(int i='0',j='9';i<j;i++,j--){
            ans+=Math.abs(freq[i]-freq[j]);
        }
        for(int i='a',j='z';i<j;i++,j--){
            ans+=Math.abs(freq[i]-freq[j]);
        }
        return ans;
    }
}
