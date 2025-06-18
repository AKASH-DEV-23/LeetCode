class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int len=nums.length;
        int[][] ans=new int[len/3][3];
        Arrays.sort(nums);
        int m=0;
        int n=0;
        for(int i=2;i<len;i=i+3){
            if(nums[i]-nums[i-2]>k) return new int[0][0];
        }
        for(int i=0;i<len;i++){
            ans[m][n++]=nums[i];
            if(n==3){
                n=0;
                m++;
            }
        }
        return ans;
    }
}
