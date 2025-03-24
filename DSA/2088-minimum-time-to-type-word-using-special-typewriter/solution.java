class Solution {
    public int minTimeToType(String word) {
        char curr='a';
        int sum=0;
        for(char ch:word.toCharArray()){
            int val=Math.abs(curr-ch);
            int mini=Math.min(val,26-val);
            sum+=mini;
            curr=ch;
        }
        // System.out.println(map);
        return sum+word.length();
    }
}
