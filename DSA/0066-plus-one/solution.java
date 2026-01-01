class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int[] ans=new int[digits[0]==9?n+1:n];
        int idx=n-1;
        while(idx>=0 && digits[idx]==9){
            digits[idx]=0;
            idx--;
        }
        if(idx<0){
            ans[0]=1;
            return ans;
        }
        digits[idx]=digits[idx]+1;
        return digits;
    }
}
