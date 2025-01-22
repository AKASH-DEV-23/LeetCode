class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        for(int i=n1-1;i>=0;i--){
            int max=-1;
            for(int j=n2-1;j>=0;j--){
                if(nums2[j]==nums1[i]){
                    break;
                }else if(nums2[j]>nums1[i]){
                    max=nums2[j];
                }
            }
            nums1[i]=max;
        }
        return nums1;
    }
}
