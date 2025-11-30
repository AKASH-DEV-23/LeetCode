class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int cnt=0;
        if(k==0)  return n;
        Map<Integer,Boolean> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int st=i;
            if(mp.containsKey(nums[i])){
                if(mp.get(nums[i]))  cnt++;
                continue;
            }
            while(st<n){
                if(nums[st]==nums[i])  st++;
                else  break;
            }
            if(n-st>=k){
                mp.put(nums[i],true);
                cnt++;
            }else{
                mp.put(nums[i],false);
            } 
        }
        return cnt;
    }
}
