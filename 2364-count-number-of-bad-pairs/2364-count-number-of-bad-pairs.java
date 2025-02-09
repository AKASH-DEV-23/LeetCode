class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(nums[0],1);
        long cnt=0;
        for(int i=1;i<nums.length;i++){
            int nextNum=nums[i]-i;
            if(map.containsKey(nextNum)){
                int value=map.get(nextNum);
                cnt+=i-value;
            }else{
                cnt+=i;
            }
            map.put(nextNum,map.getOrDefault(nextNum,0)+1);
        }
        return cnt;
    }
}