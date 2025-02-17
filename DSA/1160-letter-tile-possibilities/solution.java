class Solution {
    int cnt;
    public int numTilePossibilities(String tiles) {
        int n=tiles.length();
        cnt=0;
        int[] freq=new int[26];
        for(char ch: tiles.toCharArray()){
            freq[ch-'A']++;
        }
        solve(freq);
        return cnt-1;
    }

    private void solve(int[] freq){
        cnt++;
        for(int i=0; i<26; i++){
            if(freq[i] == 0)    continue;

            freq[i]--;
            solve(freq);
            
            freq[i]++;
        }
    }
}
