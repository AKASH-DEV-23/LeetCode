class Solution {
    public int subarraySum(int[] nums, int k) {
        int size=nums.length;
        int cnt=0;
        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=i;j<size;j++){
                sum+=nums[j];
                if(sum==k){
                    cnt++;
                }  
            }
        }
        return cnt;
    }
}
