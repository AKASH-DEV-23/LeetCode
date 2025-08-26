class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans=0;
        double maxArea=0;
        for(int[] temp:dimensions){
            int a=temp[0];
            int b=temp[1];
            double currArea=Math.sqrt((a*a)+(b*b));
            int maxi=a*b;
            if(maxArea<currArea || (currArea==maxArea && maxi > ans)){
                ans=maxi;
                maxArea=currArea;
            }
        }
        return ans;
    }
}
