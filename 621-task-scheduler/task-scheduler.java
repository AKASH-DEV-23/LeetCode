class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];

        for(char ch:tasks){
            freq[ch-'A']++;
        }
        Arrays.sort(freq);
        int i=25;
        while(i>=0 && freq[i]==freq[25]) i--;
        return Math.max(tasks.length, (freq[25]-1)*(n+1)+25-i);
    }
}