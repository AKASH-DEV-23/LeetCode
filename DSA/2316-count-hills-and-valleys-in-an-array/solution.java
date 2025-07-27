class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> list1=new ArrayList<>();
        list1.add(nums[0]);
        for(int num:nums){
            if(num!=list1.get(list1.size()-1))    list1.add(num);
        }
        int ans=0;
        // System.out.print(list1);
        for(int i=1;i<list1.size()-1;i++){
            if(list1.get(i-1)> list1.get(i) && list1.get(i+1)>list1.get(i) || 
                list1.get(i-1)<list1.get(i) && list1.get(i+1)<list1.get(i))    ans++;
        }
        return ans;
    }
}
