class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,nums,ans,new ArrayList<>());
        return ans;
    }
    private void solve(int idx, int[] nums, List<List<Integer>> ans, List<Integer> temp){
        if(idx==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);  //do something
        solve(idx+1,nums,ans,temp);  // explore 
        temp.remove(temp.size()-1);  // undo
        solve(idx+1,nums,ans,temp);  
    }
}
