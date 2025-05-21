class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        helper(nums,0);
        return ans;
    }
    private void helper(int[] arr, int idx){
        if(idx==arr.length){
            List<Integer> list=new ArrayList<>();
            for(int num:arr){
                list.add(num);
            }
            ans.add(list);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr,i,idx);
            helper(arr,idx+1);
            swap(arr,i,idx);
        }
    }
    private void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
