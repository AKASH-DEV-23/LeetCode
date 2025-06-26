class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        int idx=0;
        for(int num:nums)   ans[idx++]=num;
        for(int num:nums)   ans[idx++]=num;
        return ans;
    }
}
