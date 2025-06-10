class Solution {
    public int maxDifference(String s) {
        int[] nums=new int[26];
        for(char ch:s.toCharArray()){
            nums[ch-'a']++;
        }
        int odd=-1;
        int even=101;
        for(int num:nums){
            if(num%2!=0 && num>odd){
                odd=num;
            }
            if(num%2==0 && num!=0 && num<even){
                even=num;
            }
        }
        return odd-even;
    }
}