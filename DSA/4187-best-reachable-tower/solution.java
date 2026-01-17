class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int cx=center[0];
        int cy=center[1];
        int[] ans=new int[2];
        int maxq=-1;
        for(int[] tow:towers){
            int xi=tow[0];
            int yi=tow[1];
            int qi=tow[2];
            int dis=Math.abs(xi-cx)+Math.abs(yi-cy);
            if(dis<=radius){
                if(qi>maxq){
                    ans=new int[]{xi,yi};
                    maxq=qi;
                }
                else if(qi==maxq){
                    if(xi<ans[0]){
                        ans=new int[]{xi,yi};  
                    }else if(xi==ans[0] && yi<ans[1]){
                        ans=new int[]{xi,yi};
                    }
                }
            }
        }
        if(maxq==-1){
            return new int[]{-1,-1};
        }
        return ans;
    }
}
