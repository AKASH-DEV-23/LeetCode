class Solution {
    public int numOfPairs(String[] nums, String target) {
        int cnt=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i!=j && target.equals(nums[i]+nums[j]))  cnt++;
            }
        }
        return cnt;
    }
}
