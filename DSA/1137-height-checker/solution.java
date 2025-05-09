class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] nums=new int[n];
        int idx=0;
        for(int num:heights)    nums[idx++]=num;
        Arrays.sort(nums);
        int cnt=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=nums[i]) cnt++;
        }
        return cnt;
    }
}
