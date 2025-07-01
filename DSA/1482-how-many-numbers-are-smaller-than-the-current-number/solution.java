class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size=nums.length;
        int[] ans=new int[size];
        for(int i=0;i<size;i++){
            int cnt=0;
            for(int j=0;j<size;j++){
                if(nums[j]<nums[i]) cnt++;
            }
            ans[i]=cnt;
        }
        return ans;
    }
}
