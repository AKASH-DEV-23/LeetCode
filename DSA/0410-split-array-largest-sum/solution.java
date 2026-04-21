class Solution {
    public int splitArray(int[] nums, int k) {
        int totalSum=0;
        int left=0;
        for(int num:nums){
            totalSum+=num;
            left=Math.max(left,num);
        }   
        int right=totalSum;
        while(left<right){
            int mid=(left+right) >>> 1;
            if(isPossible(nums,mid,k)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

    private boolean isPossible(int[] nums,int sum, int k){
        int total=0;
        int cnt=1;
        for(int num:nums){
            total+=num;
            if(total>sum){
                cnt++;
                total=num;
            }
        }
        return cnt>k?false:true;
    }
}
