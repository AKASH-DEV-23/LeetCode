class Solution {
    public int maxArea(int[] heigth) {
        int left=0;
        int right=heigth.length-1;
        int maxArea=0;
        while(left<right){
            int area=Math.min(heigth[left],heigth[right])*(right-left);
            maxArea=Math.max(area,maxArea);
            if(heigth[left]<heigth[right])    left++;
            else    right--;
        }
        return maxArea;
    }
}
