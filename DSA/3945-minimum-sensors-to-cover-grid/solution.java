class Solution {
    public int minSensors(int row, int col, int k) {
        if(k==0)  return row*col;
        int senR=2*k+1;
        int rowS=(row+senR-1)/senR;
        int colS=(col+senR-1)/senR;
        return rowS*colS;
    }
}
