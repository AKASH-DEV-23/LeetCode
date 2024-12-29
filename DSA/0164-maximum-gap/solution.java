class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 0;
        }

        int cnt=0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            cnt=Math.max(cnt,nums[i]-nums[i-1]);
        }
        return cnt;
    }
}
