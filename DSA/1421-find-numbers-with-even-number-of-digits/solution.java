class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int num:nums){
            String s = num+"";
            if(s.length()%2==0)   cnt++;
        }
        return cnt;
    }
}
