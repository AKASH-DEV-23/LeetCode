class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int score =0;
        int zero=0;
        int TotalOne=0;
        int one=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                TotalOne++;
            }
        }

        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }else{
                one++;
            }
            score = Math.max(score,zero+(TotalOne-one));
        }
        return score;
    }
}
