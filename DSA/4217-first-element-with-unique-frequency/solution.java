class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int curr:nums){
            mp.put(curr,mp.getOrDefault(curr,0)+1);
        }
        int uniqueNum=-1;
        int[] cnt=new int[100001];
        for(int key:mp.keySet()){
            int freq=mp.get(key);
            cnt[freq]++;
        }
        for(int curr:nums){
            int mpfreq=mp.get(curr);
            if(cnt[mpfreq]==1){
                return curr;
            }
        }
        return -1;
    }
}
