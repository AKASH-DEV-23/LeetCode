class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums.length==1){
            int num=nums[0];
            nums[0]=num*num;
            return nums;
        }
        int end=nums.length;
        int beg=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                end=i;
                break;
            }
        }
        beg=end-1;
        System.out.println(beg+" "+end);
        int arr[] =new int[nums.length];
        int i=0;
        while(beg>=0 && end<nums.length){
            if(Math.abs(nums[beg])<=nums[end]){
                arr[i]=nums[beg];
                beg--;
            }else{
                arr[i]=nums[end];
                end++;
            }
            i++;
        }
        while(end<nums.length){
            arr[i]=nums[end];
            end++;
            i++;
        }
        while(beg>=0){
            arr[i]=nums[beg];
            beg--;
            i++;
        }

        System.out.println(Arrays.toString(arr));

        int j=0;
        for(i=0;i<arr.length;i++){
            int num=Math.abs(arr[j]);
            // System.out.print(num+" ");
            int new1=num*num;
            arr[i]=new1;
            System.out.println(new1);
            j++;
        }
        System.out.println(Arrays.toString(arr));

        return arr;
    }
}
