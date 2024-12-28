class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int n=nums.length;
        for(Integer key:map.keySet()){
            int val=map.get(key);
            if(val>n/3){
                list.add(key);
            }
        }
        return list;
        
    }
}
