class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key) set.add(i);
        }
        int n=nums.length;
        Set<Integer> ans = new HashSet<>();
        for(Integer idx:set){
            int i=0;
            while(i<n){
                if(Math.abs(i-idx)<=k)  ans.add(i);
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int num:ans){
            list.add(num);
        }
    //    Collections.sort(list);
        list.sort(null);
        return list;
    }
}