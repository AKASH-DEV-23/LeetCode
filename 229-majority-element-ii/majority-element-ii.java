class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int val=entry.getValue();
            if(val>n/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}