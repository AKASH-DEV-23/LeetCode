class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb=new StringBuilder();
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int sum=digits[i];
            sum+=carry;
            carry=sum/10;
            sb.append(sum%10);
        }
        if(carry>0){
            sb.append(carry);
        }
        sb.reverse();
        int[] ans=new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            ans[i]=sb.charAt(i)-'0';
        }
        return ans;
    }
}
