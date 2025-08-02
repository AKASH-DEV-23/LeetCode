class Solution {
    public int earliestFinishTime(int[] ls, int[] ld, int[] ws, int[] wd) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<ls.length;i++){
            for(int j=0;j<ws.length;j++){
                int wf=ws[j]+wd[j];
                int ls1=Math.max(ls[i],wf);
                int lf1=ls1+ld[i];
                int ft2=lf1;
                int lf=ls[i]+ld[i];
                int ws1=Math.max(ws[j],lf);
                int wf1=ws1+wd[j];
                int ft1=wf1;
                ans=Math.min(ans,Math.min(ft1,ft2));
            }
        }
        return ans;
    }
}
