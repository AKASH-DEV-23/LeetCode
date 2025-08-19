class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    private void solve(int idx, int[] nums, int sum, int target, List<Integer> temp, List<List<Integer>> ans){
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            if(sum+nums[i]>target)  break;
            temp.add(nums[i]);
            solve(i+1,nums,sum+nums[i],target,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
