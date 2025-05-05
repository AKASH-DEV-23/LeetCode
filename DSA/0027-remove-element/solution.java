class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            if(num!=val)    list.add(num);
        }
        for(int num:list){
            nums[i++]=num;
        }
        return i;
    }
}
