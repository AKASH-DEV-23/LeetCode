class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxi=0;
        while(left<right){
            int currHeight=Math.min(height[left],height[right]);
            int currWidth=right-left;
            int currArea=currHeight*currWidth;
            maxi=Math.max(maxi,currArea);
            if(height[left]<height[right])  left++;
            else right--;
        }
        return maxi;
    }
}
