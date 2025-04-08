class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int cnt=0;
        Set<Integer> set=new HashSet<>();
        int i;
        for( i=n-1;i>=0;i--){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                break;
            }
        }
        return (i+3)/3;
    }
}
