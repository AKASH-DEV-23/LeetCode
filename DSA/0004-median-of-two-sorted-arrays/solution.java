class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int len=m+n;
        int[] temp=new int[len];
        int i=0;  
        int j=0;
        int idx=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j])   temp[idx++]=nums1[i++];
            else    temp[idx++]=nums2[j++];
        }
        while(i<m)  temp[idx++]=nums1[i++];
        while(j<n)  temp[idx++]=nums2[j++];
        if(len%2==0){
            return (double)(temp[len/2]+temp[(len/2)-1])/2;
        }
        return temp[len/2];
    }
}
