class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(nums,temp);
        return ans;
    }
    private void solve(int[] nums, List<Integer> temp){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                solve(nums,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}
