class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int[] ans =new int[n];
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i+1;j<n;j++){
                if((nums[i]&1)==0 && (nums[j]&1)==1) cnt++;
                if((nums[i]&1)==1 && (nums[j]&1)==0) cnt++;
            }
            ans[i]=cnt;
        }
        return ans;
    }
}
