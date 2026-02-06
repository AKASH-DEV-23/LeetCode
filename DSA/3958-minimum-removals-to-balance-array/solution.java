class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int len=nums.length;

        int i=0;
        int maxLen=-1;
        while(i<len){
            long target=(long)nums[i]*k;
            int j=findIndex(nums,i,target);
            maxLen=Math.max(maxLen,(j-i));
            i++;
        }

        return len-maxLen;
    }

    private int findIndex(int[] nums, int i, long target){
        int j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]<=target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return i;
    }
}
