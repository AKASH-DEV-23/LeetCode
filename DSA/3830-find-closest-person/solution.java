class Solution {
    public int findClosest(int x, int y, int z) {
        int reachX=Math.abs(z-x);
        int reachY=Math.abs(z-y);
        if(reachX==reachY)  return 0;
        return reachX<reachY ? 1:2;
    }
}
