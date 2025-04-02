class Solution {
    List<List<Integer>> result=new ArrayList<>();
    void solve(int[] nums, int i, List<Integer> temp){
        if(i>=nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(nums,i+1,temp);
        temp.remove(temp.size()-1);
        solve(nums,i+1,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        solve(nums,0,temp);
        return result;
    }
}
