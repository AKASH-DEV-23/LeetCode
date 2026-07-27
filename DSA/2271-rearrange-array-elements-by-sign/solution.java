class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=0;
        int n=nums.length;
        int[] res=new int[n];
        int idx=0;
        while(pos<n || neg<n){
            while(pos<n && nums[pos]<0) pos++;
            if(pos<n){
                res[idx++]=nums[pos++];
            }
            while(neg<n && nums[neg]>0) neg++;
            if(neg<n){
                res[idx++]=nums[neg++];
            }
        }
        return res;
    }
}
