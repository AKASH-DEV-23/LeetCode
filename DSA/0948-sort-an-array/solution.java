class Solution {
    public int[] sortArray(int[] nums) {
       return mergeSort(nums,0,nums.length-1);
    }
    private int[] mergeSort(int[] nums, int st, int end){
        if(st<end){
            int mid=st+(end-st)/2;
            mergeSort(nums,st,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,st,mid,end);
        }
        return nums;
    }
    private void merge(int[] nums,int st, int mid, int end){
        int l= mid-st+1;
        int r=end-mid;
        int[] left=new int[l];
        int[] right=new int[r];
        int k=st;
        for(int i=0;i<l;i++){
            left[i]=nums[k++];
        }
        for(int i=0;i<r;i++){
            right[i]=nums[k++];
        }
        int i=0;
        int j=0;
        k=st;
        while(i<l && j<r){
            if(left[i]<=right[j])   nums[k++]=left[i++];
            else    nums[k++]=right[j++];
        }
        while(i<l){
            nums[k++]=left[i++];
        }
        while(j<r){
            nums[k++]=right[j++];
        }
    }
}
