class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int size=nums.length;
        int[] max=new int[size];
        int[] min=new int[size];
        max[0]=nums[0];
        min[size-1]=nums[size-1];
        for(int i=1;i<size;i++){
            max[i]=Math.max(nums[i],max[i-1]);
        }
        for(int i=size-2;i>=0;i--){
            min[i]=Math.min(nums[i],min[i+1]);
        }
        for(int i=0;i<size;i++){
            if(max[i]-min[i]<=k) return i;
        }
        return -1;
    }
}
