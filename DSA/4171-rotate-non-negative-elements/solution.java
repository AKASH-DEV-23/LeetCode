class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int total=0;
        for(int num:nums)  if(num>=0)  total++;
        if(total==0)  return nums;
        int[] arr=new int[total];
        int idx=0;
        for(int num:nums)  if(num>=0)  arr[idx++]=num;
        k=k%total;
        reverse(arr,0,k-1);
        reverse(arr,k,total-1);
        reverse(arr,0,total-1);
        idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=arr[idx++];
            }
        }
        return nums;
    }

    private void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
