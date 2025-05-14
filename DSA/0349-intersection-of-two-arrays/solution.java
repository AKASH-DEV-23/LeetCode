class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums1)  set.add(num);
        List<Integer> list=new ArrayList<>();
        for(int num:nums2){
            if(set.contains(num)){ 
                list.add(num);
                set.remove(num);
            }
        }
        int[] ans=new int[list.size()];
        int i=0;
        for(int num:list){
            ans[i++]=num;
        }
        return ans;
    }
}
