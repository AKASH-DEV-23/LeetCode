class Solution {
    Map<Integer,List<Integer>> mp;
    int ans=Integer.MAX_VALUE;
    public int minimumDistance(int[] nums) {
        mp=new HashMap<>();
        findFrequency(nums);
        for(int key:mp.keySet()){
            List<Integer> temp=mp.get(key);
            ans=Math.min(ans,findMinimumDis(temp));
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }

    private void findFrequency(int[] nums){
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(!mp.containsKey(num)){
                mp.put(num,new ArrayList<>());
            }
            mp.get(num).add(i);
        }
    }
    
    private int findMinimumDis(List<Integer> temp){
        if(temp.size()<3)   return Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=2;i<temp.size();i++){
            ans=Math.min(ans,2*(temp.get(i)-temp.get(i-2)));
        }
        return ans;
    }
}
