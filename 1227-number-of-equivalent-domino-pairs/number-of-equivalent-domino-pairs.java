class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        for(int[] a:dominoes){
            Arrays.sort(a);
        }
        int cnt=0;
        for(int i=0;i<dominoes.length;i++){
            for(int j=i+1;j<dominoes.length;j++){
                if(dominoes[i][0]==dominoes[j][0] && dominoes[i][1]==dominoes[j][1]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}