class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        int[] visited=new int[101];
        for(int i=0;i<nums.length;i++){
            if(visited[nums[i]]==k)  continue;
            list.add(nums[i]);
            visited[nums[i]]++;
        }

        int[] ans=new int[list.size()];
        int idx=0;
        for(int num:list)  ans[idx++]=num;
        return ans;
    }
}
