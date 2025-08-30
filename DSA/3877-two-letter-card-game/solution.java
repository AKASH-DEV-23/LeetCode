class Solution {
    public int score(String[] cards, char x) {
        int dpoint=0;
        int[] leftArr=new int[10];
        int[] rightArr=new int[10];
        for(String card:cards){
            char ch1=card.charAt(0);
            char ch2=card.charAt(1);
            if(ch1==x && ch2==x)  dpoint++;
            else if(ch2==x)  rightArr[ch1-'a']++;
            else if(ch1==x)  leftArr[ch2-'a']++;
        }
        int tl=0;
        int maxl=0;
        int tr=0;
        int maxr=0;
        for(int i=0;i<10;i++){
            tl+=leftArr[i];
            if(leftArr[i]>maxl) maxl=leftArr[i];
            tr+=rightArr[i];
            if(rightArr[i]>maxr)  maxr=rightArr[i];
        }
        int lp=Math.min(tl/2,tl-maxl);
        int rp=Math.min(tr/2,tr-maxr);
        int non=tl+tr;
        int t=Math.min(dpoint,non);
        int bn=Math.min(lp+rp,(non-t)/2);
        int ans= t+bn;
        return ans;
    }
}
