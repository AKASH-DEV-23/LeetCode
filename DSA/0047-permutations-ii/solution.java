class Solution {
    List<List<Integer>> ans;
    Set<List<Integer>> visited;
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans=new ArrayList<>();
        visited=new HashSet<>();
        solve(nums,0);
        for(List<Integer> temp:visited) ans.add(temp);
        return ans;
    }
    private void solve(int[] nums, int idx){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int num:nums)   temp.add(num);
            visited.add(temp);
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
