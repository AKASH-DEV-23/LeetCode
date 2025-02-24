class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int k=0;
        for(int num:nums){
            if(num==-1){
             k++;
             if(seen.size()>=k){
                ans.add(seen.get(seen.size()-k));
             }else{
                ans.add(-1);
             }
            }else{
                k=0;
                seen.add(num);
            }
        }
        return ans;
    }
}