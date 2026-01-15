class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int hMax=1;
        int vMax=1;
        int cnt=1;
        for(int i=1;i<hBars.length;i++){
            if(hBars[i]-hBars[i-1]==1){
                cnt++;
            }else{
                cnt=1;
            }
            hMax=Math.max(hMax,cnt);
        }
        cnt=1;
        for(int i=1;i<vBars.length;i++){
            if(vBars[i]-vBars[i-1]==1){
                cnt++;
            }else{
                cnt=1;
            }
            vMax=Math.max(vMax,cnt);
        }
        int height=Math.min(hMax,vMax)+1;
        return height*height;
    }
}
