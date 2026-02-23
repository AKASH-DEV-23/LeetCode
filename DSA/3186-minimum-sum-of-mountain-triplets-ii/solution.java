class Solution {
    public int minimumSum(int[] nums) {
        int size=nums.length;
        int[] minprefix=new int[size];
        int[] minsuffix=new int[size];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(min>=nums[i]){
                minprefix[i]=-1;
                min=nums[i];
            }else{
                minprefix[i]=min;
            }
        }
        min=Integer.MAX_VALUE;
        for(int i=size-1;i>=0;i--){
            if(min>=nums[i]){
                minsuffix[i]=-1;
                min=nums[i];
            }else{
                minsuffix[i]=min;
            }
        }
        System.out.println(Arrays.toString(minprefix));
        System.out.println(Arrays.toString(minsuffix));
        long ans=Long.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(minprefix[i]!=-1 && minsuffix[i]!=-1){
                if(nums[i] != minsuffix[i] && minsuffix[i]!=nums[i]){
                    long curr=nums[i]+minprefix[i]+minsuffix[i];
                    ans=Math.min(ans,curr);
                }
            }
        }
        return ans==Long.MAX_VALUE ? -1 : (int)ans;
    }
}
