class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            Set<Integer> set2=new HashSet<>();
            for(int j=i;j<n;j++){
                set2.add(nums[j]);
                if(set.size()==set2.size()) cnt++;
            }
        }
        return cnt;
    }
}
