class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        Arrays.sort(nums, (a,b)->Integer.compare(a[1],b[1]));
        int cnt=0;
        int end=nums[0][1];
        for(int i=1;i<nums.length;i++){
            if(end>nums[i][0]){
                cnt++;
            }else{
                end=nums[i][1];
            }
        }
        return cnt;
    }
}
