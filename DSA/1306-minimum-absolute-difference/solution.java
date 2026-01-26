class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
        Arrays.sort(nums);
        int minDiff=Integer.MAX_VALUE;
        int n=nums.length;

        for(int i=1;i<n;i++){
            minDiff=Math.min(minDiff,nums[i]-nums[i-1]);
        }

        List<List<Integer>> ans=new ArrayList<>();

        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]==minDiff){
                ans.add(new ArrayList<>(List.of(nums[i-1],nums[i])));
            }
        }

        return ans;

    }
}
