class Solution {
    public boolean consecutiveSetBits(int n) {
        String str=Integer.toBinaryString(n);
        int ones=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='1' && str.charAt(i-1)=='1'){
                ones++;
            }
        }
        return ones!=1?false:true;
    }
}
