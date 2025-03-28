class Solution {
    int[] flag;
    public boolean canJump(int[] nums) {
        flag=new int[nums.length];
        int ans=solve(nums,nums.length,0);
         return ans>0? true:false;
    }
    private int solve(int[] arr, int n, int idx){
        if(idx>=n-1){
            return 1;
        }
        if(flag[idx]!=0)    return flag[idx];
        for(int i=1;i<=arr[idx];i++){
            if(solve(arr,n,idx+i)==1)  return flag[i]=1;
        }
        return arr[idx]=-1;
    }
}