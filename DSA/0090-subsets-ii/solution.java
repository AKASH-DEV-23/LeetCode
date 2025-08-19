class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> visi=new HashSet<>();
        solve(0,nums,new ArrayList<>(),visi);
        for(List<Integer> temp:visi)    ans.add(new ArrayList<>(temp));
        return ans;
    }
    private void solve(int idx, int[] nums, List<Integer> temp, Set<List<Integer>> visi){
        if(idx==nums.length){
            List<Integer> tmp=new ArrayList<>(temp);
            Collections.sort(tmp);
            visi.add(tmp);
            return;
        }
        temp.add(nums[idx]);
        solve(idx+1,nums,temp,visi);
        temp.remove(temp.size()-1);
        solve(idx+1,nums,temp,visi);
    }
}
