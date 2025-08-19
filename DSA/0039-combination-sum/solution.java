class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    private void solve(int idx,int[] nums, int sum, int target, List<Integer> temp, List<List<Integer>> ans){
        if(sum>target)  return;
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            temp.add(nums[i]);
            solve(i,nums,sum+nums[i],target,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
