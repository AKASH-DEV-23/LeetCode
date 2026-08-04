class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int small=nums[0];
        int large=nums[0];

        int[] freq=new int[101];
        for(int num:nums){
            small=Math.min(small,num);
            large=Math.max(large,num);
            freq[num]++;
        }
        
        List<Integer> ans=new ArrayList<>();
        for(int i=small;i<large;i++){
            if(freq[i]==0)  ans.add(i);
        }

        return ans;
    }
}
