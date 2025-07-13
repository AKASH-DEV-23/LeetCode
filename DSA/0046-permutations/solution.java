class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        solve(nums,0);
        return ans;
    }
    private void solve(int[] nums, int idx){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }   
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            solve(nums,idx+1);
            swap(nums,i,idx);
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
