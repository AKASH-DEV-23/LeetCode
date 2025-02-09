class Solution {
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        int firstNum=reverse(nums[0]);
        map.put(nums[0]-firstNum,1);
        int MOD=1000000007;
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            int reverseNum=reverse(nums[i]);
            int diff=nums[i]-reverseNum;
            if(map.containsKey(diff)){
                cnt+=map.get(diff);
                cnt%=MOD;
            }
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        return cnt;
    }
    private int reverse(int num){
        int reverse=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            reverse=reverse*10+rem;
        }
        return reverse;
    }
}