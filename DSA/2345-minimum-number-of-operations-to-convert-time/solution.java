class Solution {
    public int convertTime(String current, String correct) {
        String[] curr=current.split(":");
        String[] corr=correct.split(":");
        int newCurr=0;
        int i=0;
        for(String s:curr){
            if(i==0){
                int val=Integer.parseInt(s);
                newCurr+=val*60;
                i++;
            }else{
                newCurr+=Integer.parseInt(s);
            }
        }
        int newCorr=0;
        i=0;
        for(String s:corr){
            if(i==0){
                int val=Integer.parseInt(s);
                newCorr+=val*60;
                i++;
            }else{
                newCorr+=Integer.parseInt(s);
            }
        }
        int diff=Math.abs(newCurr-newCorr);
        System.out.println(diff);
        int ans=0;
        while(diff>0){
            if(diff>=60){
                diff-=60;
            }else if(diff>=15){
                diff-=15;
            }else if(diff>=5){
                diff-=5;
            }else{
                diff-=1;
            }
            ans++;
        }
        return ans;

    }
}
